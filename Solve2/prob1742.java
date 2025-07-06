package LeetCode.Solve2;

public class prob1742 {

    public static void main(String[] args) {
        System.out.println(countBalls(19,28));
    }

    public static int countBalls(int lowLimit, int highLimit) {

        int totalLimit = lowLimit + highLimit;
        int sumOfNumber = 0;

        while (totalLimit != 0){
            int modNumber = totalLimit % 10;
            sumOfNumber = sumOfNumber + modNumber;
            totalLimit = totalLimit / 10;
        }
        if(sumOfNumber > 9){
            return countBalls(0,sumOfNumber);
        }

        return sumOfNumber;



    }
}
