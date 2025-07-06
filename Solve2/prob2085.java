package LeetCode.Solve2;

import java.util.HashMap;

public class prob2085 {

    public static void main(String[] args) {

        String[] w1 = {"leetcode","is","amazing","as","is"};
        String[] w2 = {"amazing","leetcode","is"};

        System.out.println(countWords(w1,w2));

    }

    public static int countWords(String[] words1, String[] words2) {

        /*
            First we will take a HaseMap to set every word with it's repetition
            in first StringArray_01. Then we will check if in StringArray_02 that
            word also available. If available than we will change the repetition
            number of that word. After that we will check how many words are repeated
            just one time as per the condition . . . . . . . . .
         */

        // Created a HashMap to set repetition of word . . . . . . .
        HashMap<String, Integer> wordRepetitionCounter = new HashMap<>();

        // Setting word repetition in terms of StringArray_01 . . . . .
        for(int indexW1 = 0; indexW1 < words1.length; indexW1++){
            if(wordRepetitionCounter.containsKey(words1[indexW1])){
                wordRepetitionCounter.put(words1[indexW1], wordRepetitionCounter.get(words1[indexW1]) + 1);
            }
            else{
                wordRepetitionCounter.put(words1[indexW1], 1);
            }
        }

        /*
            Checking if the word also contains in StringArray_02
            and if available than decrement value by (1) to change
            the repetition value of words . . . . . . .
        */
        for(int indexW2 = 0; indexW2 < words2.length; indexW2++){
            if(wordRepetitionCounter.containsKey(words2[indexW2])){
                if(wordRepetitionCounter.get(words2[indexW2]) <= 1){
                    wordRepetitionCounter.put(words2[indexW2], wordRepetitionCounter.get(words2[indexW2]) - 1);
                }
            }
        }

        // Counting how many values are repeated exact one time . . . . . .
        int exactOneTimeWordCounter = 0;
        for(int indexW1 = 0; indexW1 < words1.length; indexW1++){

            if(wordRepetitionCounter.get(words1[indexW1]) == 0){
                exactOneTimeWordCounter++;
            }
        }
        return exactOneTimeWordCounter;
    }
}
