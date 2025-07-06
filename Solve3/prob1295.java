package LeetCode.Solve3;

public class prob1295 {

    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{11, 222, 73, 356543, 0}));

    }

    public static int findNumbers(int[] nums) {

        int numberCounter = 0;
        for(int index = 0; index < nums.length; index++){
            if(isEven(nums[index])){
                numberCounter++;
            }
        }
        return numberCounter;
    }

    public static boolean isEven(int number){

        int digitCounter = 0;
        while (number != 0){
            number = number / 10;
            digitCounter++;
        }
        if((digitCounter % 2) == 0){
            return true;
        }
        return false;
    }


}
