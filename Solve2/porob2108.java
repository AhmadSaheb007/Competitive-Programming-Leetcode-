package LeetCode.Solve2;

public class porob2108 {

    public static void main(String[] args) {

    }

    public static String firstPalindrome(String[] words) {

        for(int index = 0; index < words.length; index++){
            String reverseWord = new StringBuffer(words[index]).reverse().toString();

            if(words[index].equals(reverseWord)){
                return words[index];
            }
        }

        return "";

    }
}
