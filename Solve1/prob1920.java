package LeetCode.Solve;

import java.util.Arrays;

public class prob1920 {

    public static void main(String[] args) {

        int[] n = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(n)));

    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int index = 0; index < ans.length; index++){
            ans[index] = nums[nums[index]];
        }

        return ans;
    }
}
