import java.util.ArrayList;

public class Library {
    private String name;
    private String code;
    private ArrayList<Book> listOfBooks;
    private ArrayList<Book> borrowedBooks;

    public Library(String name, String code) {
        this.name = name;
        this.code = code;
        this.listOfBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public void addNewBook(Book book) {
        if (book != null) {
            Book existingBook = checkExistBook(book.getId());
            if (existingBook == null) {
                listOfBooks.add(book);
                System.out.println("The Book Was Added Successfully");
                System.out.println("The size of the book list now is: " + listOfBooks.size());
            } else {
                System.out.println("The book already exist");
            }
        } else {
            System.out.println("Invalid Data, Please try Again.");
        }
    }

    public Book checkExistBook (int id){
        for (Book book : this.listOfBooks){
            if(book.getId() == id) return book;
        }
        return null;
    }

    public Book checkExistBorrowedBook (int id){
        for (Book book : this.borrowedBooks){
            if(book.getId() == id) return book;
        }
        return null;
    }

    // Method to remove a book from the library
    public void removeBook(int id) {
        // Check if book exists in the library
        Book book1 = checkExistBook(id);
        if (book1 != null) {
            // If book is borrowed, it cannot be removed
            if (book1.getAvailable() == Status.BORROWED) {
                System.out.println("Cannot remove book. Book is currently borrowed.");
            } else {
                // Remove book from the library
                this.listOfBooks.remove(book1);
                System.out.println("The book with ID " + id +" 123 was removed successfully.");
                System.out.println("The size of the book list now is: " + listOfBooks.size());
            }
        } else {
            System.out.println("Cannot remove book. Book does not exist in the library.");
        }
    }

    // Method to check out a book
    public void checkOut(int id, User user) {
        Book book1 = checkExistBook(id);
        if (book1 == null) {
            System.out.println("Book is not available");
            return;
        }
        if(book1.getAvailable() == Status.BORROWED){
            System.out.println("Book already borrowed");
            return;
        }
        book1.setAvailable(Status.BORROWED);
        user.borrowBook(book1);
        this.listOfBooks.remove(book1);
        this.borrowedBooks.add(book1);
        System.out.println("Successfully checked out book: " + book1.getTitle());
    }

    // Method to return a book
    public void returnBook(int id, User user) {
        Book book = checkExistBorrowedBook(id);
        if (book == null) {
            System.out.println("Book was not borrowed by this user");
            return;
        }
        book.setAvailable(Status.AVAILABLE);
        user.returnBook(book);
        borrowedBooks.remove(book);
        listOfBooks.add(book);
        System.out.println("Book returned successfully.");
    }

    // Method to display the list of available books
    public void displayAvailableBooks() {
        if (listOfBooks.isEmpty()) {
            System.out.println("No available books");
            return;
        }
        System.out.println("Available books:");
        for (Book book : listOfBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (ID: " + book.getId() + ")");
        }
    }

    // Method to display the list of borrowed books
    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books");
            return;
        }
        System.out.println("Borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (ID: " + book.getId() + ")");
        }
    }

    // Method to display the details of a specific book
    public void displayBookDetails(int id) {
        // If book in the library
        for (Book book : listOfBooks) {
            if (book.getId() == id) {
                System.out.println("Book details:");
                System.out.println("- Title: " + book.getTitle());
                System.out.println("- Author: " + book.getAuthor());
                System.out.println("- ID: " + book.getId());
                System.out.println("- Version: " + book.getVersion());
                return;
            }
        }

        // if book is borrowed
        for (Book book : borrowedBooks) {
            if (book.getId() == id) {
                System.out.println("Book details:");
                System.out.println("- Title: " + book.getTitle());
                System.out.println("- Author: " + book.getAuthor());
                System.out.println("- ID: " + book.getId());
                System.out.println("- Version: " + book.getVersion());
                System.out.println("- Status: " + book.getAvailable());
                return;
            }
        }
        System.out.println("Error: Book not found");
    }




}
