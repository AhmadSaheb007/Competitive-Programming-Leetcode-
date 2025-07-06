package LeetCode.solve4;

import java.util.*;

public class prob884 {

    public static void main(String[] args) {

        String s1 = "s z z z s", s2 = "s z ejt";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));

    }

    public static String[] uncommonFromSentences(String s1, String s2) {

        /*
           First we will split the sentence s1, s2 and convert into 2 separate Arrays
           "s1IntoWords", "s2IntoWords". Then we will use a HashMap "uncommonWordHolder"
           and map the word repetition in terms of each word. After that we will use a
           HashSet to store exactly one time repeated word, so that we can get just set
           of unique words. And convert the HashSet into a ArrayList "uncommonWordHolderArrayList"
           then into a String Array "uncommonWordHolderArray" as per as the returning condition . . . . .
        */

        // Splitting Strings into Arrays . . . . . .
        String[] s1IntoWords  = s1.split(" ");
        String[] s2IntoWords  = s2.split(" ");

        // Creating a HashMap and mapping repetition of each word . . . .
        HashMap<String, Integer> uncommonWordHolder = new HashMap<>();

        for(int index = 0; index < s1IntoWords.length; index++){
            int previousCount;
            try {
                previousCount = uncommonWordHolder.get(s1IntoWords[index]);
            } catch(NullPointerException e) {
                previousCount = 0;
            }
            uncommonWordHolder.put(s1IntoWords[index], previousCount + 1);
        }

        for(int indexOfs2 = 0; indexOfs2 < s2IntoWords.length; indexOfs2++){
            int previousCount;
            try {
                previousCount = uncommonWordHolder.get(s2IntoWords[indexOfs2]);
            } catch(NullPointerException e) {
                previousCount = 0;
            }
            uncommonWordHolder.put(s2IntoWords[indexOfs2], previousCount + 1);
        }

        // Creating HashSet and inserting keyValues(word) that repeated exact one time . . . . .
        HashSet<String> uncommonWordSet = new HashSet<>();
        for(Map.Entry<String, Integer> entry: uncommonWordHolder.entrySet()){
            if(entry.getValue() == 1){
                uncommonWordSet.add(entry.getKey());
            }
        }

        // Creating ArrayList and converting HashMap into ArrayList . . . . .
        ArrayList<String> uncommonWordHolderArrayList = new ArrayList<>(uncommonWordSet);

        // Creating String Array and converting the ArrayList into Array . . . . . .
        String[] uncommonWordHolderArray = new String[uncommonWordHolderArrayList.size()];

        for(int index = 0; index <uncommonWordHolderArray.length; index++){
            uncommonWordHolderArray[index] = uncommonWordHolderArrayList.get(index);
        }

        return uncommonWordHolderArray;
    }
}
