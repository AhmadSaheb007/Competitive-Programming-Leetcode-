package LeetCode.Solve3;

public class prob1844 {

    public static void main(String[] args) {

        System.out.println(replaceDigits("a1dd2"));

    }

    public static String replaceDigits(String s) {

        String replacedString = "";

        for(int index = 0; index < s.length(); index++){
            if((int)(s.charAt(index)) >= 48 && (int)(s.charAt(index)) <= 57){
                replacedString = replacedString + ((char)((int)(s.charAt(index - 1)) + Integer.parseInt(String.valueOf(s.charAt(index)))));
            }
            else{
                replacedString = replacedString + s.charAt(index);
            }
        }
        return replacedString;

    }
}
