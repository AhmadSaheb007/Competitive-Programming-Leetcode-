package LeetCode.solve4;

import java.util.Locale;

public class prob520 {

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("Abeer"));

    }


    public static boolean detectCapitalUse(String word) {

        // Checking if all letters of word are in Capital . . . . . .
        if(word.equals(word.toUpperCase(Locale.ROOT))){
            return true;
        }

        // Checking if all letters of word are in small . . . . . .
        else if(word.equals(word.toLowerCase(Locale.ROOT))){
            return true;
        }

        else{
            // Checking if only he first letter is in capital, else every letter in small . . . . .
            return isValidCapitalUse(word);
        }

    }

    //Function to check if only he first letter is in capital, else every letter in small . . . . .
    public static boolean isValidCapitalUse(String word){

        int _2ndLetterOfEachWord = 1;

        // Holding the original data of "word"
        String wordHolder = word;
        String newCapitalizeWord;

        //Making only the first letter in capital . . . .(Task_01)
        char firstCharacterInUpperCase = Character.toUpperCase(word.charAt(0));

        //Making every letter in small without the first letter . . . .(Task_02)
        word = word.substring(_2ndLetterOfEachWord, ((word.length())));
        word = word.toLowerCase(Locale.ROOT);

        //Task_01 + Task_02 . . . . .
        newCapitalizeWord = firstCharacterInUpperCase + word;

        return wordHolder.equals(newCapitalizeWord);

    }
}
