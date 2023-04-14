public class Pangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }
   public static boolean checkIfPangram(String sentence){
        // Create Frequency Array
      int[] arrCharCode = new int[26];
      // Store length of sentence
      int sizeOfSentence = sentence.length();

      // Loop to load existence of char.
      for(int i=0;i<sizeOfSentence;i++){
          int charCode = (int) sentence.charAt(i);
          int index = charCode - 97;
          arrCharCode[index] = 1;
      }

      // Make sure all chars. exist or not
       for (int i = 0;i<26;i++){
           if(arrCharCode[i] == 0){
               return false;
           }
       }
       return true;

   }
}