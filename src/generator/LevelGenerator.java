package generator;

import grammar.LevelGrammarBaseListener;
import grammar.LevelGrammarLexer;
import grammar.LevelGrammarParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Robin on 14.01.2017.
 */
public class LevelGenerator extends LevelGrammarBaseListener {

    private static String levelFilePath ="levelfiles/TestLevel.nbno";

    public static void main(String[] args)  {
        try {
            parseFile();
//            writeFile(buildGenClass(), OUTFILE_PATH);
            System.out.println("Class generated without problems");
        }catch(Exception e){
            System.err.println("Level could not be generated from File: ");
            e.printStackTrace();
        }
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

    @Override
    public void enterLevelName(LevelGrammarParser.LevelNameContext ctx) {
        System.out.println("Levelname:" + ctx.getText());
    }

    @Override
    public void enterNameValue(LevelGrammarParser.NameValueContext ctx) {
        System.out.println("Levelname: " + ctx.getText());
    }

    @Override
    public void enterLevelTimeValue(LevelGrammarParser.LevelTimeValueContext ctx) {
        System.out.println("Leveltime: " + ctx.getText());
    }

    @Override
    public void enterDamageValue(LevelGrammarParser.DamageValueContext ctx) {
        System.out.println("Damage: "+ ctx.getText() +"\nDamage Parent" + ctx.getParent().getText());
    }

    @Override
    public void enterEnemy(LevelGrammarParser.EnemyContext ctx) {
        System.out.println("Enemy make damage: " + ctx.enemyAttribute().damage().damageValue().getText());
        System.out.println("Enemy mapRep: " + ctx.mapRepresentation().getText());
    }

    @Override
    public void enterCharacter(LevelGrammarParser.CharacterContext ctx) {
        /*TODO bool Variable anlegen, die auf true gesetzt wird sobald ein x vorkam. wenn am ende gar kein x gesetzte
        * wird dann fehler, dass keine spieler start pos. definiert wurde in der map. wenn ein zweites mal versucht wird
        * x auf true zu setzen, dann fehler bereits vorhandener spieler spwan und Zeile+Spalte angeben wo das falsche x steht*/
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
                final int xKoord = blockCounter;
                final int yKoord = rowCounter;

                blockCounter ++;
            }
            blockCounter = 0;
            rowCounter ++;
        }
    }
}
