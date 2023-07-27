import java.util.*;

public class Task1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int T = in.nextInt();
            while (T != 0) {
                int Q = in.nextInt();
                Set<Integer> set = new HashSet<>();
                processQueries(Q, set);
                T--;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    /**
     * processQueries: Method to process queries
     * @param Q
     * @param set
     */
    public static void processQueries(int Q, Set<Integer> set) {
        for (int i = 0; i < Q; i++) {
            char queryType = in.next().charAt(0);

            switch (queryType) {
                // Insert an element x to the set
                case 'a':
                    int x = in.nextInt();
                    set.add(x);
                    break;
                // Print the contents of the set in increasing order
                case 'b':
                    printSortedSet(set);
                    break;
                // Erase an element x from the set
                case 'c':
                    x = in.nextInt();
                    set.remove(x);
                    break;
                // Print 1 if the element x is present in the set, else print -1
                case 'd':
                    x = in.nextInt();
                    System.out.println(set.contains(x) ? "1" : "-1");
                    break;

                case 'e': // Print the size of the set
                    System.out.println(set.size());
                    break;
            }
        }
    }

    /**
     * printSortedSet: Used to manipulate sorted operation
     * @param set
     */

    public static void printSortedSet(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        for (int value : sortedList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
