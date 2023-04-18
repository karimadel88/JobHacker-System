import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Occurrences {
    public static void main(String[] args) {
        // Create instanse of Scanner to read from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String string = in.nextLine();
        System.out.println("Enter Word");
        String word = in.next();
        // Using method 1
        System.out.println("The word " + word + " occurs [" + getOccurrencesOfWord1(string,word) + "] From method (1)" );
        // Using method 2
        System.out.println("The word " + word + " occurs [" + getOccurrencesOfWord2(string,word) + "] From method (2)" );

    }

    public static int getOccurrencesOfWord1(String string, String word){
        // initialize counter by 0
        int counter = 0;
        String[] words = string.split(" ");
        for (String wordItem: words){
            // Count number of occurrence of the word
            if(wordItem.equals(word)) counter++;
        }
        return counter;
    }

    public static int getOccurrencesOfWord2(String string, String word){
        // Split string by StringTokenizer class
        StringTokenizer tokenizer = new StringTokenizer(string);
        int counter = 0;
        // Used hasMoreElements method to check has more token or nor
        while (tokenizer.hasMoreElements()){
            // nextToken to move pointer to next
            String token = tokenizer.nextToken();
            if(token.equals(word)){
                counter++;
            }
        }
        return counter;
    }
}