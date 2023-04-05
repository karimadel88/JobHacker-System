/*
 * Array fill II problem
 * @version 28.3.2023
 * @author Karim Adel
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* New Scanner instance to read input from user*/
        Scanner in = new Scanner(System.in);

        /* Read T */
        int T = in.nextInt();

        /* Counter */
        int cnt = 0;

        int[] array = new int[1000];

        /* Read 20 integers from user */
        for (int i = 0; i < 1000; i++) {
            if(cnt == T){
                cnt = 0;
            }
            // print the value of each element
            System.out.println("N[" + i + "] = " + cnt);
            cnt++;
        }

        }
}
