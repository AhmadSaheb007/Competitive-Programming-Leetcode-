package LeetCode.Solve3;

public class prob2119 {

    public static void main(String[] args) {

        System.out.println(isSameAfterReversals(1200));

    }

    public static boolean isSameAfterReversals(int num) {

        int reverseOriginalNum = reverseInteger(num);
        if(reverseInteger(reverseOriginalNum) == num){
            return true;
        }
        return false;
    }

    public static int reverseInteger(int number){

        int reverserNumber = 0;
        while(number != 0){
            reverserNumber = (reverserNumber * 10) + number % 10;
            number = number / 10;
        }
        return reverserNumber;
    }
}
