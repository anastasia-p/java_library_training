/**
 * Created by aponomar on 8/30/2017.
 */
public class Book {
    private String author;
    private String title;

    public Book(String authorField, String titleField) throws BadAuthorExceprion, BadTitleException {
        try {
            setAuthor(authorField);
        } catch (BadAuthorExceprion ex) {
            System.out.println("Bad Author name!");
        }

        try {
            setTitle(titleField);
        } catch (BadTitleException ex) {
            System.out.println("Bad Title name!");
        }
    }

    void setAuthor(String author) throws BadAuthorExceprion {
        boolean fieldCorrect = StringChecker.isFieldCorrect(author, StringChecker.authorName);
        if (fieldCorrect == true) {
            this.author = author;
        } else {
            throw new BadAuthorExceprion();
        }
    }

    void setTitle(String title) throws BadTitleException {
        boolean fieldCorrect = StringChecker.isFieldCorrect(title, StringChecker.titleName);
        if (fieldCorrect == true) {
            this.title = title;
        } else {
            throw new BadTitleException();
        }
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }
}
