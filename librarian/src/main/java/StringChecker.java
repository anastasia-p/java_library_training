/**
 * Created by aponomar on 8/30/2017.
 */

import java.util.regex.*;

public class StringChecker {

    public static Pattern authorName = Pattern.compile("([a-zA-Z]+)([a-zA-Z\\u0020\\u002E\\u002D\\u0027])*");

    public static Pattern titleName = Pattern.compile("([a-zA-Z]+)([a-zA-Z\\d\\u0020\\u002c\\u002E\\u002D\\u003f" +
            "\\u0021\\u0022\\u0027\\u0028\\u0029])*");

    public static boolean isFieldCorrect(String word, Pattern field) {
        Matcher matcher = field.matcher(word);
        return matcher.matches();
    }



}
