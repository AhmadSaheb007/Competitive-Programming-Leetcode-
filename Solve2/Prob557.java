package LeetCode.Solve2;

public class Prob557 {

    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));

    }

    public static String reverseWords(String s) {

        String reverseString = "";
        String[] word = s.split(" ", 0);

        for(int index = 0; index < word.length; index++){
            StringBuffer reverseHelper = new StringBuffer();
            reverseHelper.append(word[index]);

            if(index != (word.length) - 1){
                reverseString = reverseString + reverseHelper.reverse().toString() + " ";
            }
            else {
                reverseString = reverseString + reverseHelper.reverse().toString();
            }

        }

        return reverseString;

    }
}
