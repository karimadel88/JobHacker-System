public class Book {
    // Declare private instance variables to store the book's attributes
    private String title;
    private String author;
    private int id;
    private int version;
    private Status available;

    // Constructor to create a new book object with the specified attributes
    public Book(String title, String author, int id, int version) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.version = version;
    }

    // Getter methods to retrieve the book's attributes

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public Status getAvailable() {
        return available;
    }

    // Setter methods to modify the book's attributes
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setAvailable(Status available) {
        this.available = available;
    }
}
