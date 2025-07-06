package LeetCode.Solve3;

import java.util.Locale;

public class prob1832 {

    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));


    }

    public static boolean checkIfPangram(String sentence) {

        boolean[] isLetterAvailable = new boolean[26];
        sentence = sentence.toLowerCase();

        for(int index = 0; index < sentence.length(); index++) {

            if((sentence.charAt(index) >= 'a') && (sentence.charAt(index) <= 'z')){
                isLetterAvailable[sentence.charAt(index) - 'a'] = true;
            }
        }
        for(int index = 0; index < isLetterAvailable.length; index++) {
            if(!isLetterAvailable[index]){
                return false;
            }
        }

        return true;
    }
}
