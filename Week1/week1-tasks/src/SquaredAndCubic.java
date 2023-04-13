/*
 * Squared and Cubic problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class SquaredAndCubic {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Read N from user */
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            /* Calculate the square and cube of i */
            int square = i * i;
            int cube = i * i * i;

            /* Print the result */
            System.out.printf("%d %d %d\n", i, square, cube);
        }
    }
}