package LeetCode.Solve;

import java.util.Arrays;

public class prob1929 {

    public static void main(String[] args) {

        int[] n ={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(n)));

    }

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        int ansI = 0;
        while (ansI < ans.length){
            for(int index = 0; index < nums.length; index++){
                ans[ansI] = nums[index];
                ansI++;
            }
        }

        return ans;

    }
}
