package generator;

import com.sun.deploy.util.StringUtils;
import grammar.LevelGrammarBaseListener;
import grammar.LevelGrammarLexer;
import grammar.LevelGrammarParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.GeneratorUtils;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Robin on 14.01.2017.
 */
public class LevelGenerator extends LevelGrammarBaseListener {

    /**root path to the level nbno file from which class is generated*/
    private static String levelFilePath;

    /*Levelname and so also the generated class name*/
    private static String levelName="DefaultLevelName";

    /**Varaible to check if only one player is set in the map*/
    private boolean isPlayerSpawned = false;

    /**following fields will be used for saving level objects and attributes, for writing in java class*/
    private static LevelGrammarParser.ConfigsContext levelConfigs;
    private static LevelGrammarParser.PlayerAttributesContext player;
    private static Map<Integer, LevelGrammarParser.EnemyContext> enemyClasses = new HashMap<>();

    /**String representations for generating the class*/
    private static List<String> houseStrings = new ArrayList<>();
    private static List<String> spaetiStrings = new ArrayList<>();
    private static List<String> streetStrings = new ArrayList<>();
    private static List<String> enemyStrings = new ArrayList<>();
    private static String playerString;

    public static void main(String[] args)  {
        try {
            getInputPath();
            parseFile();
            writeFile();
            System.out.println("Class generated without problems");
        }catch(Exception e){
            System.err.println("Level could not be generated from File: ");
            e.printStackTrace();
        }
    }

    private static void getInputPath(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter filename: ");
        final String fileName = reader.nextLine();
        levelFilePath = "levelfiles/" + fileName;
    }

    private static void parseFile() throws IOException {
        // Get gamefield lexer
        LevelGrammarLexer lexer = new LevelGrammarLexer(new ANTLRInputStream(new FileReader(levelFilePath)));
        lexer.removeErrorListeners();
        lexer.addErrorListener(LevelErrorListener.INSTANCE);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        LevelGrammarParser parser = new LevelGrammarParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(LevelErrorListener.INSTANCE);

        // Specify our entry point
        LevelGrammarParser.FileContext fileContext = parser.file();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        LevelGrammarBaseListener listener = new LevelGenerator();
        walker.walk(listener, fileContext);
    }

    /*Following methods check all values if they are allowed*/

    @Override
    public void enterLevelNameValue(LevelGrammarParser.LevelNameValueContext ctx) {
        final String name = ctx.getText();
        if(name.length() > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Level name is to long!", ctx.getStart()));
        }
        this.levelName = name;
    }

    @Override
    public void enterLevelTimeValue(LevelGrammarParser.LevelTimeValueContext ctx) {
        final int time = Integer.parseInt(ctx.getText());
        if(time < 0 || time > 600){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Level time is not in an allowed range.", ctx.getStart()));
        }
    }

    @Override
    public void enterSpeedValue(LevelGrammarParser.SpeedValueContext ctx) {
        final int speed = Integer.parseInt(ctx.getText());
        if(speed < 0 || speed > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Speed is not in allowed range!", ctx.getStart()));
        }
    }

    @Override
    public void enterDrinkSpeedValue(LevelGrammarParser.DrinkSpeedValueContext ctx) {
        final int drinkSpeed = Integer.parseInt(ctx.getText());
        if(drinkSpeed < 1 || drinkSpeed > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Drink speed is not in allowed range!", ctx.getStart()));
        }
    }

    @Override
    public void enterBeerLevelValue(LevelGrammarParser.BeerLevelValueContext ctx) {
        final int beerLevel = Integer.parseInt(ctx.getText());
        if(beerLevel < 1 || beerLevel > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Beer level is not in allowed range!", ctx.getStart()));
        }
    }

    @Override
    public void enterDamageValue(LevelGrammarParser.DamageValueContext ctx) {
        final int damage = Integer.parseInt(ctx.getText());
        if(damage < 0 || damage > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Damage is not in allowed range!", ctx.getStart()));
        }
    }

    @Override
    public void enterVisualRange(LevelGrammarParser.VisualRangeContext ctx) {
        final int visualRange = Integer.parseInt(ctx.getText());
        if(visualRange < 0 || visualRange > 24){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Sightdistance/visual range is not in allowed range!",
                            ctx.getStart()));
        }
    }

    @Override
    public void enterIntelligence(LevelGrammarParser.IntelligenceContext ctx) {
        final int intelligence = Integer.parseInt(ctx.getText());
        if(intelligence < 0 || intelligence > 100){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Intelligence is not in allowed range!", ctx.getStart()));
        }
    }

    @Override
    public void enterCharacter(LevelGrammarParser.CharacterContext ctx) {
        if( ctx.getText().equals("X")){
            if(isPlayerSpawned){
                throw new IllegalArgumentException(
                        GeneratorUtils.getFormattedErrorMessage("Already set a player position. Only one is possible.",
                                ctx.getStart()));
            }else{
                isPlayerSpawned = true;
            }
        }else{
            final int enemyRep = Integer.parseInt(ctx.getText());
            if(!enemyClasses.containsKey(enemyRep)){
                throw new IllegalArgumentException(
                        GeneratorUtils.getFormattedErrorMessage("Enemy set in Map without appropriate enemy class!",
                                ctx.getStart()));
            }
        }
    }

    @Override
    public void enterMapRepresentation(LevelGrammarParser.MapRepresentationContext ctx) {
        final int mapRep = Integer.parseInt(ctx.getText());
        if(mapRep < 0 || mapRep > 9){
            throw new IllegalArgumentException(
                    GeneratorUtils.getFormattedErrorMessage("Enemy map representation is not in an allowed range",
                            ctx.getStart()));
        }
    }

    /*following methods save the data which must be used later to create class*/
    @Override
    public void enterConfigs(LevelGrammarParser.ConfigsContext ctx) {
        levelConfigs = ctx;
    }

    @Override
    public void enterPlayerAttributes(LevelGrammarParser.PlayerAttributesContext ctx) {
        player = ctx;
    }

    @Override
    public void enterEnemy(LevelGrammarParser.EnemyContext ctx) {
        final int mapRep = Integer.parseInt(ctx.mapRepresentation().getText());
        enemyClasses.put(mapRep, ctx);
    }

    @Override
    public void enterMapValue(LevelGrammarParser.MapValueContext ctx) {
        final int maxRows = 20;
        final int maxBlocks= 25;
        if(ctx.row().size() != maxRows){
            throw new IllegalArgumentException("The map must have 20 rows. Not more or less.");
        }
        int rowCounter = 0;
        int blockCounter = 0;
        for(LevelGrammarParser.RowContext row : ctx.row()){
            if(row.block().size() != maxBlocks){
                throw new IllegalArgumentException("Each row in the map must contain " + maxBlocks + " Blocks. "
                        + "In Line " + row.getStart().getLine() + "is an incorrect number of blocks.");
            }
            for(LevelGrammarParser.BlockContext block : row.block()){
                final int xPos = blockCounter;
                final int yPos = rowCounter;
                final String blockVal = block.getText();

                switch (blockVal){
                    case GeneratorUtils.HOUSE:
                        generateHouseString(xPos, yPos);
                        break;
                    case GeneratorUtils.STREET:
                        generateStreetString(xPos, yPos);
                        break;
                    case GeneratorUtils.SPAETI_LEFT:
                        generateSpaetiString(xPos, yPos, "LEFT");
                        break;
                    case GeneratorUtils.SPAETI_RIGHT:
                        generateSpaetiString(xPos, yPos, "RIGHT");
                        break;
                    case GeneratorUtils.SPAETI_UP:
                        generateSpaetiString(xPos, yPos, "UP");
                        break;
                    case GeneratorUtils.SPAETI_DOWN:
                        generateSpaetiString(xPos, yPos, "DOWN");
                        break;
                    case GeneratorUtils.PLAYER:
                        generatePlayerString(xPos, yPos);
                        generateStreetString(xPos, yPos);
                        break;
                    default:        // wenn keins der oberen matched, muss es eine Zahl sein
                        generateEnemyString(Integer.parseInt(blockVal), xPos, yPos);
                        generateStreetString(xPos, yPos);
                        break;
                }

                blockCounter ++;
            }
            blockCounter = 0;
            rowCounter ++;
        }
    }

    /*following methods are for generating the java level class*/

    /**
     * Generates a String for the java class, where the house is added to a set.
     * Add the string to the appropriate string list.
     * @param x The x coordinate of the house
     * @param y The y coordinate of the house
     */
    private void generateHouseString(final int x, final int y){
        final String str = "this.blocks.add(new House(" + x + ", " + y + "));\n";
        houseStrings.add(str);
    }

    /**
     * Generates a String for the java class, where the Street is added to a set.
     * Add the string to the appropriate string list.
     * @param x The x coordinate of the house
     * @param y The y coordinate of the house
     */
    private void generateStreetString(final int x, final int y){
        final String str = "this.blocks.add(new Street(" + x + ", " + y + "));\n";
        streetStrings.add(str);
    }

    /**
     * Generates a String for the java class, where the Spaeti with given direction is added to a set.
     * Add the string to the appropriate string list.
     * @param x The x coordinate of the Spaeti
     * @param y The y coordinate of the Spaeti
     */
    private void generateSpaetiString(final int x, final int y, final String direction){
        final String str = "this.blocks.add(new Spaeti(" + x + ", " + y + ", " + "Enums.Direction." + direction + "));\n";
        spaetiStrings.add(str);
    }

    /**
     * Generates a String for the java class, where the enemy is added to a set.
     * Add the string to the appropriate string list.
     * @param x The x coordinate of the house
     * @param y The y coordinate of the house
     */
    private void generateEnemyString(final int mapRep, final int x, final int y){
        final LevelGrammarParser.EnemyContext enemy = enemyClasses.get(mapRep);
        final String name = enemy.enemyAttribute().enemyName().enemyNameValue().getText();
        final String speed = enemy.enemyAttribute().speed().speedValue().getText() + "f";
        final String sight = enemy.enemyAttribute().ki().kiValue().visualRange().getText();
        final String intelligence = enemy.enemyAttribute().ki().kiValue().intelligence().getText();
        final String target = "Enums.AttackTarget." + enemy.enemyAttribute().attackTarget().attackTargetValue().getText();
        final String damage = enemy.enemyAttribute().damage().damageValue().getText();
        final String str = "this.npcs.add(new NPC(" + x + ", " + y + ", " + speed + ", "
                + "\"" + name + "\"" + ", " + sight + ", " + intelligence + ", " + target + ", " + damage
                + "));\n";
        enemyStrings.add(str);
    }

    /**
     * Creates a String that generates a java player object.
     * @param x The x coordinate of the player
     * @param y The y coordinate of the player
     */
    private void generatePlayerString(final int x, final int y){
        final String speed = player.speed().speedValue().getText() + "f";
        final String drinkSpeed = player.drinkSpeed().drinkSpeedValue().getText() + "f";
        final String beerLvl = player.beerLevel().beerLevelValue().getText() + "f";
        playerString = "this.player = new Player(" + x + ", " + y + ", " + speed + ", " + drinkSpeed
                + ", " + beerLvl + ");";
    }

    private static List<String> generateLevelClass(){
        final List<String> result = new ArrayList<>();
        result.add("package level;");
        result.add("import objects.Enums;");
        result.add("import objects.House;");
        result.add("import objects.Spaeti;");
        result.add("import objects.NPC;");
        result.add("import objects.Player;");
        result.add("import objects.Street;");
        result.add("/** Generated Level class by LevelGenerator from .nbno file*/");
        result.add("public class " + levelName + " extends AbstractLevel {");
        result.add("public " + levelName + "() {");
        result.add("super();");
        result.add("this.levelName = \"" + levelName + "\";");
        final String lvlTime = levelConfigs.levelTime().levelTimeValue().getText();
        result.add("this.initialLevelTime = " + lvlTime + ";");
        result.add(playerString);
        result.addAll(enemyStrings);
        result.addAll(houseStrings);
        result.addAll(streetStrings);
        result.addAll(spaetiStrings);
        result.add("}");
        result.add("}");

        return result;
    }

    private static void writeFile(){
        try {
            final String upperLevelName = levelName.substring(0,1).toUpperCase() + levelName.substring(1);
            BufferedWriter bw = new BufferedWriter(new FileWriter("generatedlevels/" + upperLevelName + ".java"));
            for (final String line : generateLevelClass()) {
                bw.write(line);
                bw.write(System.getProperty("line.separator"));
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
