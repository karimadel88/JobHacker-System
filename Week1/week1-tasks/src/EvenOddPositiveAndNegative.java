/*
 * Even, Odd, Positive and Negative problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Counters for even, odd, positive and negative */
        int even = 0, odd = 0, positive = 0, negative = 0;

        for (int i = 0; i < 5; i++) {
            /* Read value from user */
            int value = in.nextInt();

            /* Check if value is even */
            if (Math.abs(value) % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            /* Check if value is positive or negative */
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            }
        }

        /* Print the results */
        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", positive);
        System.out.printf("%d valor(es) negativo(s)\n", negative);
    }
}