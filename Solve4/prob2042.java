package LeetCode.solve4;

public class prob2042 {

    public static void main(String[] args) {

        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));

    }

    public static boolean areNumbersAscending(String s) {

        int currentMaxNumber = Integer.MIN_VALUE;


        for(int index = 0; index < s.length(); index++){

            if((s.charAt(index) > 48) && (s.charAt(index) < 57)){
                if(s.charAt(index) < currentMaxNumber){
                    return false;
                }
                else{
                    currentMaxNumber = (int)s.charAt(index);
                }
            }
        }
        return true;
    }
}
