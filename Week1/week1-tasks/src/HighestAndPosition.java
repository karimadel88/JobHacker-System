/*
 * Highest and Position problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Initialize max value to the smallest possible integer value */
        int max = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 0; i < 100; i++) {
            /* Read value from user */
            int value = in.nextInt();

            /* Check if value is greater than current max value */
            if (value > max) {
                max = value;
                position = i + 1;
            }
        }

        /* Print the result */
        System.out.println(max);
        System.out.println(position);
    }
}