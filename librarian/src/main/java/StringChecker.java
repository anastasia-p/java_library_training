/**
 * Created by aponomar on 8/30/2017.
 */

import java.util.regex.*;

public class StringChecker {

    public static Pattern authorName = Pattern.compile("([a-zA-Z]+)([a-zA-Z\\u0020\\u002E\\u002D\\u0027])*");

    public static boolean isFieldCorrect(String word, Pattern field) {
        Matcher matcher = field.matcher(word);
        System.out.println("Validation for '" + word +
                (matcher.matches() ? "' passed." : "' not passed."));
        return matcher.matches();
    }



}
