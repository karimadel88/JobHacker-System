import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Reversed String From method 1 is : " + reverse1(string));
        System.out.println("Reversed String From method 2 is : " + reverse2(string));

    }

    // Method 1
    public static String reverse1(String string) {
        // Convert string to char array
        char[] charArray = string.toCharArray();

        // Reverse the char array
        for(int i=0; i<charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        // Convert the char array back to string
        return new String(charArray);
    }

    // Method 2
    public static String reverse2(String string){
        // Used StringBuilder Class and used from it reverse method
        return new StringBuilder(string).reverse().toString();
    }
}