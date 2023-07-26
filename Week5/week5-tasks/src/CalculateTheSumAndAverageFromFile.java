import java.io.*;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheSumAndAverageFromFile {
    // Create Private instance from Scanner Class
    private static final Scanner in = new Scanner(System.in);
    private static final String WEB_URL = "http://liveexample.pearsoncmg.com/data/Scores.txt";
    private static final String FILE_URL = "/home/karim/Desktop/internship/JobHacker-System/Week5/week5-tasks/src/Scores.txt";
    public static void main(String[] args) {
        // Call for first time only
        File file = readFromWebToFile(WEB_URL);
        File file1 = new File(FILE_URL);
        System.out.println(getSum(file1));
        System.out.println(getLength(file1));
        System.out.println(getAverage(file1));
    }

    // Function to read from web and save it in file
    public static File readFromWebToFile(String url){
        File file = new File("");
        try{
            // Instance to deal with url and url function to open stream and read from it
            URL url1 = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_URL));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                System.out.println("Successfully..");
            }
            reader.close();
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return file;
    }

    // Function to get sum of numbers that existing in file
    public static int getSum (File file){
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            scanner.close();

        }catch (IOException ioException){
            System.out.println(ioException);
        }
        return sum;
    }

    // Function To get size of numbers in file
    public static int getLength(File file){
        int size = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                scanner.nextInt();
                size++;
            }
            scanner.close();
        }catch (IOException ioException){
            System.out.println(ioException);
        }
        return size;
    }

    // Function to get Average of File by use two methods getSum and getLength
    public static double getAverage(File file){
        return (double) getSum(file) /getLength(file);
    }



}