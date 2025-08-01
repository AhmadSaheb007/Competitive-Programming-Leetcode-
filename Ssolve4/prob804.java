package LeetCode.solve4;

import java.util.HashMap;
import java.util.HashSet;

public class prob804 {

    public static void main(String[] args) {

        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));

    }

    public static int uniqueMorseRepresentations(String[] words) {
        /*
            We will convert all words to MorseCode using customized function
            "transformWordToMorseCode". Then we will store all transformed values
            into a HashSet, so that we can get just the size of just unique values.
         */

        // Holding unique morse code in String . . . . . .
        HashSet<String> uniquesMorseCodeHolder = new HashSet<>();

        // Converting All words to morseCode . . . . . . .
        for(int indexOfWord = 0; indexOfWord < words.length; indexOfWord++){

            // Sending words to "transformWordToMorseCode" to get morse code . . . . . .
            String wordToMorseCode = transformWordToMorseCode(words[indexOfWord], indexOfWord) ;

            // Adding morseCode to Hashset
            uniquesMorseCodeHolder.add(wordToMorseCode);
        }

        // Returning size of hashSet . . . . . .
        return uniquesMorseCodeHolder.size();
    }

    public static String transformWordToMorseCode(String words, int indexOfWord){

        // Holding all morseCode in an array . . . . .
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....", "..",
                ".---","-.-",".-..","--","-.","---",".--.", "--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};

        String wordToMorseCode = "";

        // Converting words to CharArray . . . . . .
        char[] eachWordInChars;
        eachWordInChars = words.toCharArray();

        // Converting each letter of word . . . . . .
        for (int indexOfEachWord = 0;
             indexOfEachWord < eachWordInChars.length;
             indexOfEachWord++){

            wordToMorseCode = wordToMorseCode + morseCode[eachWordInChars[indexOfEachWord] - 'a'];

        }

        // Returning transformed MorseCode . . . . .
        return wordToMorseCode;
    }
}
