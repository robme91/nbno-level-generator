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
	 * Enter a parse tree produced by {@link LevelGrammarParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(LevelGrammarParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link LevelGrammarParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(LevelGrammarParser.MapContext ctx);
}