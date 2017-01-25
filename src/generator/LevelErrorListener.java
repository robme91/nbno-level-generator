package generator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by Robin
 * This is an ErrorListener to get Java Exceptions, if lexing and parsing a level
 * file, does not accords with the level grammar rules.
 */
public class LevelErrorListener extends BaseErrorListener {
    /**
     * Create an Instance of this Error Listener
     */
    public static LevelErrorListener INSTANCE = new LevelErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        throw new IllegalArgumentException(msg + "\nWrong smybol: " + offendingSymbol + " in Line " + line + ":"
                + charPositionInLine );
    }
}
