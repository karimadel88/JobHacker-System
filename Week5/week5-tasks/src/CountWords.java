import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CountWords {
    // Create Private instance from Scanner Class
    private static final Scanner in = new Scanner(System.in);
    private static final String path = "/home/karim/Desktop/internship/JobHacker-System/Week5/week5-tasks/src/Lincoln.txt";
    public static void main(String[] args) {
        System.out.println(countWords(path));

    }

    /**
     * countWords is a function that take fileName in read from it then count number of words
     * @returns counter
     */
    public static int countWords(String fileName) {
        int counter = 0;
        try {
            FileInputStream fileInput = new FileInputStream(fileName);

            int previousChar = ' '; // Initialize to space to handle word counting at the start of the file
            int currentChar;

            while ((currentChar = fileInput.read()) != -1) {
                if (isCharacterAlphabet(currentChar) && !isCharacterAlphabet(previousChar)) {
                    counter++;
                }
                previousChar = currentChar;
            }

            fileInput.close(); // Close the input stream after use
        } catch (Exception e) {
            System.out.println(e);
        }
        return counter;
    }

    // Helper method to check if the character is an alphabet (a-z or A-Z)
    private static boolean isCharacterAlphabet(int character) {
        return (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
    }

}

