package LeetCode.solve4;

public class prob2169 {

    public static void main(String[] args) {

        System.out.println(countOperations(0, 1));

    }


    public static int countOperations(int num1, int num2) {

        /*
           Using a while loop with a condition that if both of these two
           number if greater than 0(zero), then we subtract smaller number
           from bigger number and will increment numberOf operations
           by one and return total number of operations. . . . . . . .
        */

        int totalOperationCounter = 0;

        // Running a while loop to count number of operations . . . . . .
        while (Math.min(num1, num2) > 0){

            if(num1 >= num2){
                num1 = num1 - num2;
            }

            else {
                num2 = num2 - num1;
            }

            totalOperationCounter++;
        }

        return totalOperationCounter;

    }
}
