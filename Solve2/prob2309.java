package LeetCode.Solve2;

public class prob2309 {

    public static void main(String[] args) {
        char x = 'a';
        System.out.println(greatestLetter("Abeer"));
    }

    public static String greatestLetter(String s) {

        char maxLetter = s.charAt(0);
        int indexOfString = 1;
        while (s.charAt(indexOfString) != '0'){
            if(((int)maxLetter) >= ((int)s.charAt(indexOfString))){
                maxLetter = s.charAt(indexOfString);
            }
        }
        return String.valueOf(maxLetter);
    }
}
