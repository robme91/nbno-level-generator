// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator\LevelGrammar.g4 by ANTLR 4.5.3
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
}