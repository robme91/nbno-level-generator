// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator\LevelGrammar.g4 by ANTLR 4.5.3
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
	 * Enter a parse tree produced by {@link LevelGrammarParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(LevelGrammarParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(LevelGrammarParser.NameValueContext ctx);
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
	 * Enter a parse tree produced by {@link LevelGrammarParser#mapRepresentationValue}.
	 * @param ctx the parse tree
	 */
	void enterMapRepresentationValue(LevelGrammarParser.MapRepresentationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#mapRepresentationValue}.
	 * @param ctx the parse tree
	 */
	void exitMapRepresentationValue(LevelGrammarParser.MapRepresentationValueContext ctx);
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
	 * Enter a parse tree produced by {@link LevelGrammarParser#attackValue}.
	 * @param ctx the parse tree
	 */
	void enterAttackValue(LevelGrammarParser.AttackValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#attackValue}.
	 * @param ctx the parse tree
	 */
	void exitAttackValue(LevelGrammarParser.AttackValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LevelGrammarParser#attackValueValue}.
	 * @param ctx the parse tree
	 */
	void enterAttackValueValue(LevelGrammarParser.AttackValueValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#attackValueValue}.
	 * @param ctx the parse tree
	 */
	void exitAttackValueValue(LevelGrammarParser.AttackValueValueContext ctx);
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
	 * Enter a parse tree produced by {@link LevelGrammarParser#mapSetUp}.
	 * @param ctx the parse tree
	 */
	void enterMapSetUp(LevelGrammarParser.MapSetUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#mapSetUp}.
	 * @param ctx the parse tree
	 */
	void exitMapSetUp(LevelGrammarParser.MapSetUpContext ctx);
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
	 * Enter a parse tree produced by {@link LevelGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterMapValue(LevelGrammarParser.MapValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitMapValue(LevelGrammarParser.MapValueContext ctx);
}