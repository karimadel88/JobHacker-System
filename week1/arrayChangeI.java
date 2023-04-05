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

        int[] array = new int[20];

        /* Read 20 integers from user */
        for (int i = 0; i < 20; i++) {
            array[i] = in.nextInt();
        }

        /* Swap the first and last elements, the second and last but one elements, and so on */
        for (int i = 0; i < 10; i++) {
            int temp = array[i];
            array[i] = array[19 - i];
            array[19 - i] = temp;
        }

        /* Print the modified array */
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, array[i]);
        }
        }
}
