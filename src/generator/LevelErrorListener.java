package generator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by Robin on 20.01.2017.
 */
public class LevelErrorListener extends BaseErrorListener {
    public static LevelErrorListener INSTANCE = new LevelErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        throw new IllegalArgumentException(msg + "\nWrong smybol: " + offendingSymbol + " in Line " + line + ":"
                + charPositionInLine );
    }
}
