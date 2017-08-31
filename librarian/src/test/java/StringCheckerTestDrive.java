import org.testng.annotations.Test;

public class StringCheckerTestDrive {

    @Test
    public void patternCheck() {
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
