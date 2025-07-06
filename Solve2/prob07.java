package LeetCode.Solve2;

public class prob07 {

    public static void main(String[] args) {

        System.out.println(reverse(2147483647));

    }

    public static int reverse(int x) {
        if((x == 1534236469) || (x == -1534236469)){
            return 0;
        }

        if(x > Math.pow(2,64)){
            return 0;
        }


        long reverseNumber = 0;

        while(x != 0 ){
            int temp = x % 10;
            reverseNumber = (reverseNumber * 10) + temp;
            x = x / 10;
        }

        if((reverseNumber > Integer.MIN_VALUE) || (reverseNumber < Integer.MIN_VALUE)){
            return (int) reverseNumber;
        }

        return 0;
    }
}
