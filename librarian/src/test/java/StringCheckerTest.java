import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringCheckerTest {

    @DataProvider
    public Iterator<Object[]> validAuthor() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/authorValid.csv"));
        String line = reader.readLine();
        while (line != null) {
            list.add(new Object[] {line});
            line = reader.readLine();
        }
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> invalidAuthor() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/authorInvalid.csv"));
        String line = reader.readLine();
        while (line != null) {
            list.add(new Object[] {line});
            line = reader.readLine();
        }
        return list.iterator();
    }

    @Test(dataProvider = "validAuthor")
    public void authorCheckPositive(String author) {
        boolean fieldCorrect = StringChecker.isFieldCorrect(author, StringChecker.authorName);
        Assert.assertEquals(fieldCorrect, true);
    }

    @Test(dataProvider = "invalidAuthor")
    public void authorCheckNegative(String author) {
        boolean fieldCorrect = StringChecker.isFieldCorrect(author, StringChecker.authorName);
        Assert.assertEquals(fieldCorrect, false);
    }
}
