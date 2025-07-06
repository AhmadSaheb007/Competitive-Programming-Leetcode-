package LeetCode.Solve2;

public class prob1816 {

    public static void main(String[] args) {

        System.out.println(truncateSentence("I am Abeer Boss Vai",4));

    }

    public static String truncateSentence(String s, int k) {

        String newString = "";

        String[] word = s.split(" ", 0);

        for(int index = 0; index < k; index++){
            if(index == (k - 1))
            newString = newString + word[index];
            else {
                newString = newString + word[index] + " ";
            }
        }

        return newString;
    }
}
