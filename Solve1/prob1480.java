package LeetCode.Solve;

import java.util.Arrays;

public class prob1480 {

    public static void main(String[] args) {

        int[] n = {1,1,1,1,1};

        System.out.println(Arrays.toString(runningSum(n)));

    }


    public static int[] runningSum(int[] nums) {

        int[] ans = new int[nums.length];

        for(int index1 = 0; index1 < ans.length; index1++){
            for(int index2 = 0; index2 < index1 + 1; index2++){
                ans[index1] = ans[index1] + nums[index2] ;
            }
        }

        return ans;

    }


}
