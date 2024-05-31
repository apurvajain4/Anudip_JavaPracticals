import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

public class Lab1_a1{
    public static void main(String[] args) {
       
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "ABC", "XYZ"));
        books.add(new Book(2, "QWE", "ASD"));
        books.add(new Book(3, "JKL", "PQR"));

        System.out.println("All Book Details:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println();
        }
    }
}
