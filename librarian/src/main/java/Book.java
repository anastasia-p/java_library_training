/**
 * Created by aponomar on 8/30/2017.
 */
public class Book {
    private String author;
    private String title;

    void setAuthor(String author) {
        boolean fieldCorrect = StringChecker.isFieldCorrect(author, StringChecker.authorName);
        if (fieldCorrect == true) {
            this.author = author;
        }
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }
}
