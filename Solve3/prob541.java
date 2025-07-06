package LeetCode.Solve3;

public class prob541 {

    public static void main(String[] args) {

        System.out.println(reverseStr("abcdefg", 2));

    }

    public static String reverseStr(String s, int k) {

        int index = 1;
        String reversedString = "";

        while (index < s.length()){

            reversedString = reversedString + reversePartOfString(s.substring((index - 1), (index - 1) + (2 * k)), index);

            index = index + (2 * k);

        }
        return reversedString;

    }

    public static String reversePartOfString(String s, int k){

        String partialReversedString = "";

        for(int index1 = k; index1 >= 0; index1--){
            partialReversedString = partialReversedString + s.charAt(index1);
        }
        for(int index2 = (k + 1); index2 <= (2 * k) + 1; index2++){
            partialReversedString = partialReversedString + s.charAt(index2);
        }
        return partialReversedString;
    }
}
