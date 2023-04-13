/*
 * Multiples problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Read values of A and B */
        int A = in.nextInt();
        int B = in.nextInt();

        /* Check if A and B are multiples */
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
    }
}