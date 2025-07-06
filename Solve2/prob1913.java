package LeetCode.Solve2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prob1913 {

    public static void main(String[] args) {
        int[] n = {2,9,5,9,1};

        System.out.println(maxProductDifference(n));

    }

    public static int maxProductDifference(int[] nums) {

        int max1 = Arrays.stream(nums).max().getAsInt();
        int min1 = Arrays.stream(nums).min().getAsInt();
        int indicator = 0;

        for(int i = 0; i < nums.length; i++){
            if(max1 == nums[i]){
                nums[i] = (int) ((-2) * Math.pow(10,22));
                indicator = i;
                break;
            }
        }
        int max2 = Arrays.stream(nums).max().getAsInt();
        nums[indicator] = (int) (2 * Math.pow(10,22));

        for(int index = 0; index < nums.length; index++){
            if(min1 == nums[index]){
                nums[index] = (int) (2 * Math.pow(10,22));
                break;
            }
        }
        int min2 = Arrays.stream(nums).min().getAsInt();

        return ((max1 * max2) - (min1 * min2));


    }
}
