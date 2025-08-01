package LeetCode.solve4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class prob1941 {

    public static void main(String[] args) {

        System.out.println(areOccurrencesEqual("abbabcc"));

    }

    public static boolean areOccurrencesEqual(String s) {

        /*
           First we will store count letter repetition in terms of
           each letter by a HashMap "charRepetitionMap" as well as
           we will add letters into a HashSet "holdUniqueChar" to
           get unique letter set. Then, we will match each letter
           of HashSet to HashMap to check if all letters repeated
           equally. If repeated equally, the program will terminate
           by returning true . . . . . . . . . .
         */

        // Creating a HashMap and HashSet to count and store repetition
        // in terms of each letter . . . . . .
        HashMap<Character, Integer> charRepetitionMap = new HashMap<>();
        HashSet<Character> holdUniqueChar = new HashSet<>();

        // Storing repetition in terms of each letter . . . . . .
        for(int charIndex = 0; charIndex < s.length(); charIndex++){

            int previousCount;
            try {
                previousCount = charRepetitionMap.get(s.charAt(charIndex));
            } catch(NullPointerException e) {
                previousCount = 0;
            }

            charRepetitionMap.put(s.charAt(charIndex), previousCount + 1);
            holdUniqueChar.add(s.charAt(charIndex));

        }
        int firstIndexValue = 0;

        // Creating Array to convert HashSet into an array . . . . .
        char[] holdUniqueCharArray = new char[holdUniqueChar.size()];
        int arrayIndex = 0;

        for(char letterOfString : holdUniqueChar){
            holdUniqueCharArray[arrayIndex] = letterOfString;
            arrayIndex++;
        }

        // Checking if the all letters repeated equally . . . . . .
        Integer veryFirstKeyValue =charRepetitionMap.get(s.charAt(firstIndexValue));

        for(int charIndex = 1; charIndex < holdUniqueChar.size(); charIndex++){
            Integer e =charRepetitionMap.get(holdUniqueCharArray[charIndex]);
            if(!Objects.equals(charRepetitionMap.get(holdUniqueCharArray[charIndex]), veryFirstKeyValue)){
                return false;
            }
        }
        return true;
    }
}
