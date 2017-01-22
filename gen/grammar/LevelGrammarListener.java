// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator/src/grammar\LevelGrammar.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LevelGrammarParser}.
 */
public interface LevelGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LevelGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LevelGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#levelName}.
	 * @param ctx the parse tree
	 */
	void enterLevelName(LevelGrammarParser.LevelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#levelName}.
	 * @param ctx the parse tree
	 */
	void exitLevelName(LevelGrammarParser.LevelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#levelNameValue}.
	 * @param ctx the parse tree
	 */
	void enterLevelNameValue(LevelGrammarParser.LevelNameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#levelNameValue}.
	 * @param ctx the parse tree
	 */
	void exitLevelNameValue(LevelGrammarParser.LevelNameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#levelConfigs}.
	 * @param ctx the parse tree
	 */
	void enterLevelConfigs(LevelGrammarParser.LevelConfigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#levelConfigs}.
	 * @param ctx the parse tree
	 */
	void exitLevelConfigs(LevelGrammarParser.LevelConfigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#configs}.
	 * @param ctx the parse tree
	 */
	void enterConfigs(LevelGrammarParser.ConfigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#configs}.
	 * @param ctx the parse tree
	 */
	void exitConfigs(LevelGrammarParser.ConfigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#levelTime}.
	 * @param ctx the parse tree
	 */
	void enterLevelTime(LevelGrammarParser.LevelTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#levelTime}.
	 * @param ctx the parse tree
	 */
	void exitLevelTime(LevelGrammarParser.LevelTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#levelTimeValue}.
	 * @param ctx the parse tree
	 */
	void enterLevelTimeValue(LevelGrammarParser.LevelTimeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#levelTimeValue}.
	 * @param ctx the parse tree
	 */
	void exitLevelTimeValue(LevelGrammarParser.LevelTimeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(LevelGrammarParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(LevelGrammarParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#playerAttributes}.
	 * @param ctx the parse tree
	 */
	void enterPlayerAttributes(LevelGrammarParser.PlayerAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#playerAttributes}.
	 * @param ctx the parse tree
	 */
	void exitPlayerAttributes(LevelGrammarParser.PlayerAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(LevelGrammarParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(LevelGrammarParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#speedValue}.
	 * @param ctx the parse tree
	 */
	void enterSpeedValue(LevelGrammarParser.SpeedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#speedValue}.
	 * @param ctx the parse tree
	 */
	void exitSpeedValue(LevelGrammarParser.SpeedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#drinkSpeed}.
	 * @param ctx the parse tree
	 */
	void enterDrinkSpeed(LevelGrammarParser.DrinkSpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#drinkSpeed}.
	 * @param ctx the parse tree
	 */
	void exitDrinkSpeed(LevelGrammarParser.DrinkSpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#drinkSpeedValue}.
	 * @param ctx the parse tree
	 */
	void enterDrinkSpeedValue(LevelGrammarParser.DrinkSpeedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#drinkSpeedValue}.
	 * @param ctx the parse tree
	 */
	void exitDrinkSpeedValue(LevelGrammarParser.DrinkSpeedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#beerLevel}.
	 * @param ctx the parse tree
	 */
	void enterBeerLevel(LevelGrammarParser.BeerLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#beerLevel}.
	 * @param ctx the parse tree
	 */
	void exitBeerLevel(LevelGrammarParser.BeerLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#beerLevelValue}.
	 * @param ctx the parse tree
	 */
	void enterBeerLevelValue(LevelGrammarParser.BeerLevelValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#beerLevelValue}.
	 * @param ctx the parse tree
	 */
	void exitBeerLevelValue(LevelGrammarParser.BeerLevelValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#enemies}.
	 * @param ctx the parse tree
	 */
	void enterEnemies(LevelGrammarParser.EnemiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#enemies}.
	 * @param ctx the parse tree
	 */
	void exitEnemies(LevelGrammarParser.EnemiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#enemy}.
	 * @param ctx the parse tree
	 */
	void enterEnemy(LevelGrammarParser.EnemyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#enemy}.
	 * @param ctx the parse tree
	 */
	void exitEnemy(LevelGrammarParser.EnemyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#mapRepresentation}.
	 * @param ctx the parse tree
	 */
	void enterMapRepresentation(LevelGrammarParser.MapRepresentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#mapRepresentation}.
	 * @param ctx the parse tree
	 */
	void exitMapRepresentation(LevelGrammarParser.MapRepresentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#enemyAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEnemyAttribute(LevelGrammarParser.EnemyAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#enemyAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEnemyAttribute(LevelGrammarParser.EnemyAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#enemyName}.
	 * @param ctx the parse tree
	 */
	void enterEnemyName(LevelGrammarParser.EnemyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#enemyName}.
	 * @param ctx the parse tree
	 */
	void exitEnemyName(LevelGrammarParser.EnemyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#enemyNameValue}.
	 * @param ctx the parse tree
	 */
	void enterEnemyNameValue(LevelGrammarParser.EnemyNameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#enemyNameValue}.
	 * @param ctx the parse tree
	 */
	void exitEnemyNameValue(LevelGrammarParser.EnemyNameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#attackTarget}.
	 * @param ctx the parse tree
	 */
	void enterAttackTarget(LevelGrammarParser.AttackTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#attackTarget}.
	 * @param ctx the parse tree
	 */
	void exitAttackTarget(LevelGrammarParser.AttackTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#attackTargetValue}.
	 * @param ctx the parse tree
	 */
	void enterAttackTargetValue(LevelGrammarParser.AttackTargetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#attackTargetValue}.
	 * @param ctx the parse tree
	 */
	void exitAttackTargetValue(LevelGrammarParser.AttackTargetValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#damage}.
	 * @param ctx the parse tree
	 */
	void enterDamage(LevelGrammarParser.DamageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#damage}.
	 * @param ctx the parse tree
	 */
	void exitDamage(LevelGrammarParser.DamageContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#damageValue}.
	 * @param ctx the parse tree
	 */
	void enterDamageValue(LevelGrammarParser.DamageValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#damageValue}.
	 * @param ctx the parse tree
	 */
	void exitDamageValue(LevelGrammarParser.DamageValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#ki}.
	 * @param ctx the parse tree
	 */
	void enterKi(LevelGrammarParser.KiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#ki}.
	 * @param ctx the parse tree
	 */
	void exitKi(LevelGrammarParser.KiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#kiValue}.
	 * @param ctx the parse tree
	 */
	void enterKiValue(LevelGrammarParser.KiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#kiValue}.
	 * @param ctx the parse tree
	 */
	void exitKiValue(LevelGrammarParser.KiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#visualRange}.
	 * @param ctx the parse tree
	 */
	void enterVisualRange(LevelGrammarParser.VisualRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#visualRange}.
	 * @param ctx the parse tree
	 */
	void exitVisualRange(LevelGrammarParser.VisualRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#intelligence}.
	 * @param ctx the parse tree
	 */
	void enterIntelligence(LevelGrammarParser.IntelligenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#intelligence}.
	 * @param ctx the parse tree
	 */
	void exitIntelligence(LevelGrammarParser.IntelligenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(LevelGrammarParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(LevelGrammarParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterMapValue(LevelGrammarParser.MapValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitMapValue(LevelGrammarParser.MapValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(LevelGrammarParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(LevelGrammarParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LevelGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LevelGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#building}.
	 * @param ctx the parse tree
	 */
	void enterBuilding(LevelGrammarParser.BuildingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#building}.
	 * @param ctx the parse tree
	 */
	void exitBuilding(LevelGrammarParser.BuildingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(LevelGrammarParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(LevelGrammarParser.CharacterContext ctx);
}