package LeetCode.solve4;

public class prob70 {

    public static void main(String[] args) {

    }


    public int climbStairs(int n) {

        /*
           we will take a recursive function which will decrease
           1 and 2 steps in a recursive loop. Each time we will
           add possible all operations of decreasing 1 and 2 steps.
           As well as we will store total operations of decrimination
           of 1 and 2 steps in an Array "memorizeNOperationsArray", so
           that program should go fpr less operations . . . . . . .
        */

        // Creating an Array to store operations . . . . .
        int[] memorizeNOperationsArray = new int[n + 1];

        // Calling a recursiveFunction . . . . .
        return recursivelyCountOperations(n, memorizeNOperationsArray);
    }

    // Creating a recursive function . . . . .
    public int recursivelyCountOperations(int n, int[]memorizeNOperations){

        if(n <= 1){
            return 1;
        }

        /* If nth index value is already available, then
           directly return that value while doing that all
           operation again to do all operations again . . . .
         */
        if(memorizeNOperations[n] > 0){
            return memorizeNOperations[n];
        }

        // Calculating operations of decreasing 1 and 2 steps accordingly . . . . . .
        int climbStairsOperation1 = recursivelyCountOperations(n - 1, memorizeNOperations);
        int climbStairsOperation2 =  recursivelyCountOperations(n - 2, memorizeNOperations);

        // Storing operations in array . . . . . . .
        memorizeNOperations[n] = climbStairsOperation1 + climbStairsOperation2;

        return climbStairsOperation1 + climbStairsOperation2;

    }

}
