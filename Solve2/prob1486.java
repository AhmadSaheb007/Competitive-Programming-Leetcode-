package LeetCode.Solve2;

public class prob1486 {

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }

    public static int xorOperation(int n, int start) {

        int[] modifiedArray = new int[n];

        for(int index = 0; index < n; index++){
            modifiedArray[index] = start + (2 * index);
        }

        int finalValueOfXorOperation = modifiedArray[0];
        for(int index = 0; index < n; index++){
            finalValueOfXorOperation = finalValueOfXorOperation ^ modifiedArray[index];
        }

        return finalValueOfXorOperation;


    }
}
