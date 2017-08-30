/**
 * Created by aponomar on 8/30/2017.
 */
public class BookTestDrive {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Test Book Title");
        b.author = "T.B.Author";

        if ((b.getAuthor() == "T.B.Author") && (b.getTitle() == "Test Book Title")) {
            System.out.println("Object 'Book' with title 'Test Book Title' and author 'T.B.Author' was created SUCCESSFULLY!!");
        }
    }
}
