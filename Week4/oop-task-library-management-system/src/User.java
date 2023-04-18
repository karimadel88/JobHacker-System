import java.util.ArrayList;
import java.util.List;

public class User {

    // Declare private instance variables to store the user's attributes
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    // Constructor to create a new user object with the specified attributes
    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<Book>();
    }

    // Getter methods to retrieve the user's attributes
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to add a book to the user's list of borrowed books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to remove a book from the user's list of borrowed books
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
