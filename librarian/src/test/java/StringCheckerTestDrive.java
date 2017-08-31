/**
 * Created by aponomar on 8/30/2017.
 */
public class StringCheckerTestDrive {

    public static void main(String[] args) {
        StringChecker.isFieldCorrect("Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("A.S.Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("A. S. Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("A S Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("Aleksandr Sergeevich Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("Mamin-Sibiryk", StringChecker.authorName);
        StringChecker.isFieldCorrect("D'Artanian", StringChecker.authorName);
        StringChecker.isFieldCorrect("K. D'Artanian-Aramisskiy", StringChecker.authorName);
        StringChecker.isFieldCorrect("", StringChecker.authorName);
        StringChecker.isFieldCorrect(" ", StringChecker.authorName);
        StringChecker.isFieldCorrect("-Pushkin", StringChecker.authorName);
        StringChecker.isFieldCorrect("'Artanian", StringChecker.authorName);
    }
}
