package LeetCode.solve4;

public class prob1372 {

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));

    }

    public static int numberOfSteps(int num) {

        /*
           First we will take a while loop and rum the
           loop until num == 0. If num is even then
           num = num / 2, else we will decrement by 1.
           And in both case we will increment number of
           operation by 1 and return the total operation
           numbers. . . . . . . .
        */

        int dividedByTwoOperationCounter = 0;

        // Running a loop until num == 0 . . . . . .
        while (num != 0){

            if(num % 2 == 0){
                num = num / 2;
            }
            else{
                num = (num - 1);
            }
            dividedByTwoOperationCounter++;

        }
        return dividedByTwoOperationCounter;
    }
}
