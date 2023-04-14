import java.util.Stack;

public class LongestCommon {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
   public static String longestCommonPrefix(String[] strs){
       // If the input array is null or empty, return an empty string
       if (strs == null || strs.length == 0) {
           return "";
       }

       // Set the first string in the array as the initial prefix
       String prefix = strs[0];

       // Compare the current prefix with each string in the array
       for (int i = 1; i < strs.length; i++) {
           // If the current string does not start with the current prefix,
           while (!strs[i].startsWith(prefix)) {
               // remove the last character from the prefix and try again
               prefix = prefix.substring(0, prefix.length() - 1);
           }
       }
       return prefix;
   }
}