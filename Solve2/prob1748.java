package LeetCode.Solve2;

import java.util.Arrays;

public class prob1748 {

    public static void main(String[] args) {

        System.out.println(sumOfUnique(new int[]{1, 2, 2, 4}));

    }

    public static int sumOfUnique(int[] nums) {

        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count <= 1){
                sum = sum + nums[i];
            }
        }

        return sum;
    }
}
