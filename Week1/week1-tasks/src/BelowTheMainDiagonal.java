/*
 * 1184 - Below the Main Diagonal
 * @version 28.3.2023
 * @author Karim Adel
*/

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        // Create instance from scanner to read input
        Scanner in = new Scanner(System.in);

        // Variables
        char character = in.next().charAt(0);
        double[][] matrix = new double[12][12];

        // Read Values of matrix
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }

        // Initialization result
        double result = 0.0;
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                result += matrix[i][j];
                counter++;
            }
        }

        // Check if he want to get Average
        if (character == 'M') {
            result /= counter;
        }

        // Print Result with one fraction
        System.out.printf("%.1f\n", result);
    }
}
