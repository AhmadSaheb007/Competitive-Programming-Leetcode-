package LeetCode.Solve2;

public class prob233 {

    public static void main(String[] args) {

        System.out.println(countDigitOne(13));

    }

    public static int countDigitOne(int n) {

        if( n == 0){
            return 0;
        }

        int totalOne = 0;
        for(int index = 0; index <= n; index++){
            if(isOneAvailable(index)){
                totalOne++;
            }
        }

        return totalOne;

    }

    public static boolean isOneAvailable(int number) {

        while(number != 0){

            int lastIndexOfCurrentNumber = number % 10;
            if(lastIndexOfCurrentNumber == 1){
                return true;
            }
            else{
                number = number / 10;
            }
        }
        return false;
    }

}
