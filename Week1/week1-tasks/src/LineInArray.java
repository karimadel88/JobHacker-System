/*
 * 1181 - Line in Array
 * @version 5.4.2023
 * @author Karim Adel
 */

import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        // Create instance from scanner to read input
        Scanner in = new Scanner(System.in);

        // Variables
        int numberOfRow = in.nextInt();
        char character = in.next().charAt(0);
        double[][] matrix = new double[12][12];

        // Read Values of matrix
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = in.nextDouble();
            }
        }

        // Initialization result
        double result = 0.0;
        
        // Get Summation of row
        for (int j = 0; j < 12; j++) {
            result += m[numberOfRow][j];
        }

        // Check if he want to get Average
        if (character == 'M') {
            result /= 12;
        }

        // Print Result with one fraction
        System.out.printf("%.1f\n", result);
    }
}
