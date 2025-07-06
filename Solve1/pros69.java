package LeetCode.Solve;

import java.util.Arrays;

public class pros69 {
    public static void main(String[] args) {

        int[] n = {1, 2, 0};

        System.out.println(searchInsert(n));

    }

    public static int searchInsert(int[] nums) {

        int arrayIndexValue = nums[0];
        int getPosition = 0;
        int index = 1;


        do{
            if( nums[index] >= 0){
                if(nums[index] <= arrayIndexValue){
                    arrayIndexValue = nums[index];
                    getPosition = index;

                }
            }
            index++;
        } while (index < nums.length);
        return getPosition +1 ;

    }




}
