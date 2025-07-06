package LeetCode.solve4;

public class prob859 {

    public static void main(String[] args) {

        System.out.println(buddyStrings("ab", "ba"));

    }

    public static boolean buddyStrings(String s, String goal) {


        return (s.charAt(1) == goal.charAt(0))
                && (s.charAt(0) == goal.charAt(1));

    }
}
