package LeetCode.solve4;

import java.util.Locale;

public class prob2129 {

    public static void main(String[] args) {

        System.out.println(capitalizeTitle("i aHmAd ABEER"));

    }

    public static String capitalizeTitle(String title) {

        /*
           First we will split the sentence and hold all words into a StringArray
           "wordOfTitle". Then we will check is the first index(index[0]) of each
           word is capital(if not then convert into Capital letter) and rest of the
           word is in small letter(if not then convert into small letters). After that,
           we will ad all words to make a String and will return it . . . . . .
         */

        // Spliting the sentence into wordsArray . . . . .
        String[] wordOfTitle = title.split(" ");

        int _2ndLetterOfEachWord = 1;
        String afterCapitalizeTitle = "";

        //Changing every word of "wordOfTitle" . . . . . . .
        for(int wordNumber = 0; wordNumber < wordOfTitle.length; wordNumber++){

            String newCapitalizeWord = "";

            // Condition of the problem . . . . .
            if((wordOfTitle[wordNumber].length() == 1) || (wordOfTitle[wordNumber].length() == 2)){
                wordOfTitle[wordNumber]= wordOfTitle[wordNumber].toLowerCase(Locale.ROOT);
                afterCapitalizeTitle = afterCapitalizeTitle + wordOfTitle[wordNumber];
            }
            // Capitalizing only the first letter of each word, else every this in small letter . . . . . .
            else{

                char firstCharacterInUpperCase = Character.toUpperCase(wordOfTitle[wordNumber].charAt(0));
                wordOfTitle[wordNumber] = wordOfTitle[wordNumber].substring(_2ndLetterOfEachWord, ((wordOfTitle[wordNumber].length())));
                newCapitalizeWord = firstCharacterInUpperCase + wordOfTitle[wordNumber].toLowerCase(Locale.ROOT);

            }

            // Adding every word to make it a String . . . . . .
            if(wordNumber == wordOfTitle.length - 1){
                afterCapitalizeTitle = afterCapitalizeTitle + newCapitalizeWord;
            }
            else {
                afterCapitalizeTitle = afterCapitalizeTitle + newCapitalizeWord + " ";
            }

        }
        return afterCapitalizeTitle;
    }


}
