public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("WOW"));
        System.out.println(isPalindrome("test"));
    }

    public static boolean isPalindrome(String string){
        // Palindrome must start == end as example wow => palindrome
        for(int i=0; i<string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length() - i - 1)){
                return  false;
            }
        }
        return true;
    }
}