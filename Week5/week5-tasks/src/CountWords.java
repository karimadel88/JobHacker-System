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

    public static int countWords(String fileName) {
        int counter = 0;
        try{
            // Instance from file  to move pointer from first charchter
            FileInputStream fileInput=new FileInputStream(path);
            // Another Instance from file to move from next Character
            FileInputStream fileInput2=new FileInputStream(path);
            // initial Value of to pointers
            int indexForFirstChar = 0;
            int indexForNextChar = 0;

            while (indexForFirstChar != -1){
                indexForNextChar = fileInput2.read();
                // Check this pattern (valid char) + (invalid char) example (karim- or karim" " or karim- or --)
                if(((indexForFirstChar>=65 && indexForFirstChar<=90) || (indexForFirstChar>=97 && indexForFirstChar<=122)) && !((indexForNextChar>=65 && indexForNextChar<=90) || (indexForNextChar>=97 && indexForNextChar<=122))){
                    counter++;
                }
                indexForFirstChar = fileInput.read();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return counter;
    }

}

