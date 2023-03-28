/*
 * Extremely Basic problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Num1 and num2 first and second number from user */
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        /* Output result of num1 + num2 */
        System.out.println("X = " + (num1 + num2));

    }
}