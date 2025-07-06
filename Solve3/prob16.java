package LeetCode.Solve3;

import java.util.Arrays;

public class prob16 {

    public static void main(String[] args) {

        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));

    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int zeroCombinationCounter = 0;

        for(int index1 = 0; index1 < nums.length; index1++){
            for(int index2 = index1; index2 < nums.length; index2++){
                for(int index3 = index2; index3 < nums.length; index3++){

                    if(nums[index1] + nums[index2]+ nums[index3] == target){
                        zeroCombinationCounter++;
                    }
                }
            }
        }
        return zeroCombinationCounter;
    }
}
