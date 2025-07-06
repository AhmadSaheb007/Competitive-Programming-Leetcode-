package LeetCode.Solve3;

public class prob2185 {

    public static void main(String[] args) {

        System.out.println(prefixCount(new String[]{"atpay", "attention", "practice", "attend"},"at"));

    }

    public static int prefixCount(String[] words, String pref) {

        int wordCounter = 0;
        pref = pref + "(.*)";

        for(int word = 0; word < words.length; word++){
            if((words[word].matches(pref))){
                wordCounter++;
            }
        }
        return wordCounter;
    }
}
