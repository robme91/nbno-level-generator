// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator/src/grammar\LevelGrammar.g4 by ANTLR 4.5.3
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LevelGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LevelGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(LevelGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#levelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelName(LevelGrammarParser.LevelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(LevelGrammarParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#levelConfigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelConfigs(LevelGrammarParser.LevelConfigsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#configs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigs(LevelGrammarParser.ConfigsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#levelTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelTime(LevelGrammarParser.LevelTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#levelTimeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelTimeValue(LevelGrammarParser.LevelTimeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(LevelGrammarParser.PlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#playerAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerAttributes(LevelGrammarParser.PlayerAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed(LevelGrammarParser.SpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#speedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeedValue(LevelGrammarParser.SpeedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#drinkSpeed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrinkSpeed(LevelGrammarParser.DrinkSpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#drinkSpeedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrinkSpeedValue(LevelGrammarParser.DrinkSpeedValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#beerLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeerLevel(LevelGrammarParser.BeerLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#beerLevelValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeerLevelValue(LevelGrammarParser.BeerLevelValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#enemies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemies(LevelGrammarParser.EnemiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#enemy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemy(LevelGrammarParser.EnemyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#mapRepresentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapRepresentation(LevelGrammarParser.MapRepresentationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#enemyAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemyAttribute(LevelGrammarParser.EnemyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#enemyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemyName(LevelGrammarParser.EnemyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#enemyNameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemyNameValue(LevelGrammarParser.EnemyNameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#attackTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttackTarget(LevelGrammarParser.AttackTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#attackTargetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttackTargetValue(LevelGrammarParser.AttackTargetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#damage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamage(LevelGrammarParser.DamageContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#damageValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamageValue(LevelGrammarParser.DamageValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#ki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKi(LevelGrammarParser.KiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#kiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKiValue(LevelGrammarParser.KiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#visualRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisualRange(LevelGrammarParser.VisualRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#intelligence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntelligence(LevelGrammarParser.IntelligenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(LevelGrammarParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapValue(LevelGrammarParser.MapValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(LevelGrammarParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LevelGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#building}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilding(LevelGrammarParser.BuildingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LevelGrammarParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(LevelGrammarParser.CharacterContext ctx);
}