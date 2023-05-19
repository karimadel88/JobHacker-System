/*
 * Extremely Basic problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Num1 and num2 first and second number from user */
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        /* Output result of num1 + num2 */
        System.out.println("X = " + (number1 + number2));

    }
}