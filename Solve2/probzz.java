package LeetCode.Solve2;

public class probzz {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121435));


    }

    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int number = x;
        int reversedInteger = 0;

        while(number != 0){
            reversedInteger = reversedInteger * 10;
            reversedInteger = (reversedInteger + (number % 10)) ;
            number = number / 10;
        }

        if(reversedInteger == x){
            return true;
        }

        return false;

    }

}
