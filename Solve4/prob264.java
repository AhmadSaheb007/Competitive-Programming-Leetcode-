package LeetCode.solve4;

public class prob264 {

    public static void main(String[] args) {

        System.out.println(nthUglyNumber(1352));

    }

    public static int nthUglyNumber(int n) {

        int number = 0;
        int nthNumber = 0;

        while(nthNumber < n){

            number++;
            if(isUgly(number)){
                nthNumber++;
                System.out.println(nthNumber);
            }


        }
        return number;
    }

    public static boolean isUgly(int n) {

        if(n == 0){
            return false;
        }

        while(n != 1){
            if(n % 2 == 0){
                n = n/2;
            }
            else if(n % 3 == 0){
                n = n/3;
            }

            else if(n % 5 == 0){
                n = n/5;
            }

            else {
                return false;
            }
        }

        return true;
    }
}
