package LeetCode.Solve3;

public class prob2255 {

    public static void main(String[] args) {

    }

    public int countPrefixes(String[] words, String s) {

        int prefixCounter = 0;
        for(int index = 0; index < words.length; index++){

            words[index] = words[index] + "(.*)";
            if((s.matches(words[index]))){
                prefixCounter++;
            }
        }
        return prefixCounter;
    }
}
