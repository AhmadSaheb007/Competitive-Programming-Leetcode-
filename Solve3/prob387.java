package LeetCode.Solve3;

public class prob387 {

    public static void main(String[] args) {

        System.out.println(firstUniqChar( "dddccdbba"));

    }

    public static int firstUniqChar(String s) {

        int[] letterPositionArray = new int[26];

        for(int index = 0; index < s.length(); index++){
            letterPositionArray[((int)s.charAt(index)) - 'a']++;

        }

        for(int index = 0; index < s.length(); index++){

            if((letterPositionArray[((int)s.charAt(index)) - 'a'] == 1)){
                return index ;
            }
        }
        return -1;
    }

}
