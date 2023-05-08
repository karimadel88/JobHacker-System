import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTask {
    // Create Private instance from Scanner Class
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum of Two Number is " + result);
    }

    // Function to take number and handle error
    public static int takeNumber(){
        int number = 0;
        boolean checkInteger = false;
        while(!checkInteger){
            System.out.println("Enter Your Number");
            try{
                number = in.nextInt();
                checkInteger = true;
            }catch (InputMismatchException e){
                System.out.println("Please enter integers only.");
                in.nextLine();
            }
        }
        return number;
    }

    // The parent function to sum two numbers
    public static int sum(){
        return takeNumber() + takeNumber();
    }
}