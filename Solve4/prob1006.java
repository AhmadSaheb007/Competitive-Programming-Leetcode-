package LeetCode.solve4;

public class prob1006 {

    public static void main(String[] args) {

    }

    public int clumsy(int n) {

        int totalFraction = n;
        int number = n;
        while(number != 0){

            if(number % 2 == 0){
                totalFraction = totalFraction * (number - 1);
            }





            number--;
        }

        return 0;

    }
}
