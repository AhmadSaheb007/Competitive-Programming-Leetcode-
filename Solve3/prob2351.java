package LeetCode.Solve3;

public class prob2351 {

    public static void main(String[] args) {

        System.out.println(repeatedCharacter("wnncc"));

    }

    public static char repeatedCharacter(String s) {

        int[] letterPositionArray = new int[26];

        for(int index = 0; index < s.length(); index++){
            letterPositionArray[((int)s.charAt(index)) - 'a']++;
            if(letterPositionArray[((int)s.charAt(index)) - 'a'] >= 2){
                return s.charAt(index);
            }
        }

        return '\0';
    }
}
