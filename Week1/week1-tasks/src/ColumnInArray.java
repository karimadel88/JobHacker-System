/*
 * 1181 - Column in Array
 * @version 5.4.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        // Create instance from scanner to read input
        Scanner in = new Scanner(System.in);

        // Variables
        int numberOfColumn = in.nextInt();
        char ch = in.next().charAt(0);
        double[][] m = new double[12][12];

        // Read Values of matrix
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = in.nextDouble();
            }
        }

        // Initialization result
        double result = 0.0;

        for (int i = 0; i < 12; i++) {
            result += m[i][numberOfColumn];
        }

        // Check if he want to get Average
        if (ch == 'M') {
            result /= 12;
        }

        // Print Result with one fraction
        System.out.printf("%.1f\n", result);
    }
}
