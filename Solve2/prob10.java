package LeetCode.Solve2;

public class prob10 {

    public static void main(String[] args) {

    }

    public static boolean isMatch(String s, String p) {

        if(s.equals(p)){
            return true;
        }

        else{
            for(int index = 0; index < s.length(); index++){
                if(s.charAt(index) == '*'){
                    return true;
                }
                if(s.charAt(index) == '.'){
                    return true;
                }
                else if((s.charAt(index) == '.') &&
                        (s.charAt(index) == '*')){
                    return true;
                }
            }
        }

        return false;
    }
}
