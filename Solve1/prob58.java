

public class prob58 {

    public static void main(String[] args) {

        lengthOfLastWord("Hello I am Abeer");
        System.out.println(lengthOfLastWord("Hello I am Abe445er"));

    }

    public static int lengthOfLastWord(String s) {

        String[] word = s.split(" ", 0);
        return word[word.length-1].length();

    }
}
