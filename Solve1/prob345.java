package LeetCode.Solve;

public class prob345 {

    public static void main(String[] args) {

        System.out.println(reverseVowels("aA"));

    }

    public static String reverseVowels(String s) {

        String temp = "";

        for(int index = 0; index < s.length(); index++){
            if((s.charAt(index) == 'a')|| (s.charAt(index) == 'e') ||(s.charAt(index) == 'i')||
                    (s.charAt(index) == 'o') || (s.charAt(index) == 'u')||
                    (s.charAt(index) == 'A')|| (s.charAt(index) == 'E') ||(s.charAt(index) == 'I')||
                    (s.charAt(index) == 'O') || (s.charAt(index) == 'U')){
                temp = temp + s.charAt(index);
            }
        }

        int tempIndex = temp.length() - 1;

        String newS = "";

        for(int index = 0; index < s.length(); index++){
            if((s.charAt(index) == 'a')|| (s.charAt(index) == 'e') ||(s.charAt(index) == 'i')||
                    (s.charAt(index) == 'o') || (s.charAt(index) == 'u')||
                    (s.charAt(index) == 'A')|| (s.charAt(index) == 'E') ||(s.charAt(index) == 'I')||
                    (s.charAt(index) == 'O') || (s.charAt(index) == 'U')){
                newS = newS + temp.charAt(tempIndex);
                tempIndex--;
            }
            else{
                newS = newS + s.charAt(index);
            }

        }

        return newS;

    }
}
