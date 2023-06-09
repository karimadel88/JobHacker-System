/*
 * Average 2 problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* read inputs from user */
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        /* Calculate AVG */
        double average = ((a*2) + (b*3) + (c*5)) / 10;

        /* Print the result with one decimal place */
        System.out.printf("MEDIA = %.1f\n", average);
    }
}