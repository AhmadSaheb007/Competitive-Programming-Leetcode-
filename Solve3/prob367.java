package LeetCode.Solve3;

public class prob367 {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(1));

    }

    public static boolean isPerfectSquare(int num) {

        int numTemp = 0;
        int index = 1;

        if(num == 1){
            return true;
        }

        while(index < num){
            numTemp = numTemp + index;
            index = index + 2;
            if(numTemp == num){
                return true;
            }
        }
        return false;
    }
}
