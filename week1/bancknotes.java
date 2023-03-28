/*
 * Banknotes problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Read value from user */
        int value = in.nextInt();

        /* Array of banknotes */
        int[] banknotes = { 100, 50, 20, 10, 5, 2, 1 };

        /* Print the value */
        System.out.println(value);

        /* Loop through the banknotes */
        for (int i = 0; i < banknotes.length; i++) {
            /* Calculate the number of banknotes */
            int numberOfBanknotesForI = value / banknotes[i];

            /* Subtract the value of the banknotes from the total value */
            value -= numberOfBanknotesForI * banknotes[i];

            /* Print the count of banknotes */
            System.out.printf("%d nota(s) de R$ %d,00\n", numberOfBanknotesForI, banknotes[i]);
        }
    }
}