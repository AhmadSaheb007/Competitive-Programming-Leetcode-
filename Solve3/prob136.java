package LeetCode.Solve3;

public class prob136 {

    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {

        for(int index = 0; index < nums.length; index++){
            if(repitationCounter(nums,nums[index]) == 1){
                return nums[index];
            }
        }
        return 0;
    }

    public static int repitationCounter(int[] nums, int number) {

        int repitationCounter = 0;
        for(int index = 0; index < nums.length; index++){

            if(number == nums[index]){
                repitationCounter++;
            }
        }
        return repitationCounter;
    }
}
