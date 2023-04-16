/*
 * Area of a Circle problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class AreaOfCycle {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner input = new Scanner(System.in);

        /* read R(radius) from user */
        double radius = input.nextDouble();

        /* n or PI = 3.14159 */
        double PI = 3.14159;

        /* Output result of n * R^2 */
        System.out.printf("A=%.4f\n" , (PI * (radius * radius)));

    }
}