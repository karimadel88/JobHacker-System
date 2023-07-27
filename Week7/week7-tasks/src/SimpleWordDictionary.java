import java.util.*;

public class SimpleWordDictionary {
    private Map<Character, List<String>> dictionary;

    public SimpleWordDictionary() {
        dictionary = new HashMap<>();
    }

    /**
     * addWord : used to add the word to the suitable row and if not have it will create new instance
     * @param word
     */
    public void addWord(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }

        char firstChar = word.charAt(0);
        List<String> wordList = dictionary.get(firstChar);
        if(wordList == null){
             wordList = new ArrayList<>();
        }
        wordList.add(word);
        Collections.sort(wordList);
        dictionary.put(firstChar, wordList);
    }


    /**
     * printAllLettersAndWords: method used to print
     */
    public void printAllLettersAndWords() {
        for (char letter : dictionary.keySet()) {
            List<String> wordList = dictionary.get(letter);
            System.out.print(letter + ": ");
            for (String word : wordList) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    /**
     * printWordsOfLetter: method to print items of list of string by character
     * @param letter
     */

    public void printWordsOfLetter(char letter) {
        if (dictionary.containsKey(letter)) {
            List<String> wordList = dictionary.get(letter);
            for (String word : wordList) {
                System.out.print(word + " ");
            }
            System.out.println();
        } else {
            System.out.println("No words found for the letter " + letter);
        }
    }

    public static void main(String[] args) {
        SimpleWordDictionary dictionary = new SimpleWordDictionary();
        dictionary.addWord("zamale");
        dictionary.addWord("ahly");
        dictionary.addWord("Ismaily");
        dictionary.addWord("petrojet");
        dictionary.addWord("Enppi");
        dictionary.addWord("Emar");
        dictionary.addWord("Easla");
        dictionary.addWord("smoah");

        System.out.println("All Dictionary:");
        dictionary.printAllLettersAndWords();

        System.out.println("\nWords for the letter 'z':");
        dictionary.printWordsOfLetter('z');

        System.out.println("\nWords for the letter 'E':");
        dictionary.printWordsOfLetter('E');
    }
}
