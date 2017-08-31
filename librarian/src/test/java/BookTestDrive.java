/**
 * Created by aponomar on 8/30/2017.
 */
public class BookTestDrive {

   /* public void bookCreation(String author, String title) {
        Book b = new Book();
        b.setAuthor(author);
    }*/

    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("");
        b.setTitle("Test Book Title");

        if ((b.getAuthor() == "") && (b.getTitle() == "Test Book Title")) {
            System.out.println("Object 'Book' with title 'Test Book Title' and author 'T.B.Author' was created SUCCESSFULLY!!");
        }
    }
}
