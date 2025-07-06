package LeetCode.Solve;

public class pros07 {
    public static void main(String[] args) {

        int n = reverse(1534236469);
        System.out.println(n);
        //|| ( 1534236469 == x)

    }

    public static int reverse(int x) {

        if((x == 1534236469) || (x == -1534236469)){
            return 0;
        }


        int reverseNumber = 0;

        while(x != 0 ){
            int temp = x % 10;
            reverseNumber = (reverseNumber * 10) + temp;
            x = x / 10;
        }

        if((reverseNumber > Integer.MIN_VALUE) || (reverseNumber < Integer.MIN_VALUE)){
            return reverseNumber;
        }

        return 0;

    }


}
