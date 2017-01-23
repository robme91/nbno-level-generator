package utils;

import org.antlr.v4.runtime.Token;

/**
 * Created by Robin on 21.01.2017.
 */
public class GeneratorUtils {

    /**These constants represents the dsl possibilties for the level map*/
    public static final String HOUSE = "H";
    public static final String STREET = "S";
    public static final String PARK = "P";
    public static final String SPAETI_LEFT = "<";
    public static final String SPAETI_RIGHT = ">";
    public static final String SPAETI_UP = "^";
    public static final String SPAETI_DOWN = "V";
    public static final String PLAYER = "X";


    /**
     * Returns true if given string contains a number.
     * @param str The String that contains a number or not
     * @return True if the string is a number
     */
    public static boolean isNumber(final String str){
        return str.matches("\\d+");
    }

    /**
     * Returns the a String with the given Message, following by line and column number of the start token
     * @param message The message text that shall be returned
     * @param startToken The start token of the wrong value
     * @return String with message and line and column number
     */
    public static String getFormattedErrorMessage(final String message,final Token startToken){
        return message + "in Line " + startToken.getLine() + ":" +startToken.getCharPositionInLine();
    }

}
