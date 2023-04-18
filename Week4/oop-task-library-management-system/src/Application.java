import java.util.Scanner;

public class Application {
    private Library library;
    private Scanner scanner = new Scanner(System.in);
    private User currentUser;

    private boolean login = false;

    public Application() {
        String name = readStringFromUser("Enter Name of library");
        String code = readStringFromUser("Enter Code of library");
        this.library = new Library(name,code);
        this.currentUser = null;
    }

    public Application(Library library) {
        this.library = library;
        this.currentUser = null;
    }

    // This function to start application
    public void run() {
        System.out.println("Welcome to the Library Application!");

        while (true) {
            displayMainMenu();
            int choice = readIntFromUser("Enter your choice: ");

            switch (choice) {
                case 1:
                    if(!login) {
                        currentUser = takeUser();
                        login = true;
                    }
                    else {
                        login = false;
                        currentUser = null;
                        break;
                    }
                    break;
                case 2:
                    this.library.addNewBook(takeBook());
                    break;
                case 3:
                    this.library.removeBook(readIntFromUser("Enter id of this book to remove it"));
                    break;
                case 4:
                    this.library.checkOut(readIntFromUser("Enter id of book to checked out of it"),currentUser);
                    break;
                case 5:
                    this.library.returnBook(readIntFromUser("Enter id of book to return it"),currentUser);
                    break;
                case 6:
                    this.library.displayAvailableBooks();
                    break;
                case 7:
                    this.library. displayBorrowedBooks();
                    break;
                case 8:
                    this.library.displayBookDetails(readIntFromUser("Enter id of book"));
                    break;
                case 9:
                    System.out.println("Thank you for using the Library Application!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Menu start at entry point of program
    private void displayMainMenu() {
        System.out.println("\n=== Main Menu ===");
        // This condition to show login or logout at suitable condition
        if (currentUser == null && !login) {
            System.out.println("1. Login");
            return;
        } else {
            System.out.println("1. Logout");
        }
        System.out.println("2. Add New Book");
        System.out.println("3. Remove Book");
        System.out.println("4. Check Out Book");
        System.out.println("5. Return Book");
        System.out.println("6. Display Available Books");
        System.out.println("7. Display Borrowed Books");
        System.out.println("8. Display Book Details");
        System.out.println("9. Exit");
    }

    // Simple function to read input as integer and handle error of input
    public int readIntFromUser(String prompt) {
        int input;
        while (true) {
            try {
                System.out.println(prompt);
                input = scanner.nextInt();
//                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine(); // clear the input buffer
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return input;
    }

    // Simple function to read input as String and handle error of input
    public  String readStringFromUser(String prompt) {
        String input;
        while (true) {
            try {
                System.out.println(prompt);
                input = scanner.next();
//                scanner.nextLine();
                break;
            } catch (Exception e) {
                scanner.nextLine(); // clear the input buffer
                System.out.println("Invalid input. Please enter a string.");
            }
        }
        return input;
    }

    // This function to create From User instance user
    public User takeUser (){
        String name = readStringFromUser("Enter Your Name");
        scanner.nextLine();
        String id = readStringFromUser("Enter Your ID");
//        scanner.nextLine();
        return new User(name,id);
    }

    // This function to take input from user and create From Book instance book
    public Book takeBook (){
        String title = readStringFromUser("Enter the title of book");
        String author = readStringFromUser("Enter name of author");
        int id = readIntFromUser("Enter ID of this book");
        if (id < 0){
            System.out.println("Id Must be positive");
            return null;
        }
        int version = readIntFromUser("Enter Version of this book");
        return new Book(title,author,id,version);
    }

}
