package LeetCode.Solve;

import java.math.BigInteger;
import java.util.Arrays;

public class PROB414 {
    public static void main(String[] args) {

        int[] num = {3,2,1};

        System.out.println(thirdMax(num));

    }

    public static int thirdMax(int[] nums){

        Arrays.sort(nums);
        if(nums.length < 3){
            return nums[nums.length - 1];
        }
        int kthMaxValue = nums[nums.length - 1];
        int kthCounter = 1;

        for (int index = nums.length - 1; index >= 0; index--) {

            if(nums[index] < kthMaxValue){
                kthMaxValue = nums[index];
                kthCounter++;
            }

            if (kthCounter == 3) {
                return kthMaxValue;
            }

        }
        if (kthCounter < 3) {
            return nums[nums.length - 1];
        }

        return kthMaxValue;

    }
//    public static BigInteger find3rdMaxNumber(BigInteger[] nums, int kth) {
//
//        Arrays.sort(nums);
//        BigInteger kthMaxValue = new BigInteger("9223372036854775807");
//        int kthCounter = 0;
//        BigInteger temp;
//
//        for (int index = nums.length - 1; index >= 0; index--) {
//
//            temp = nums[index].min(kthMaxValue);
//            kthMaxValue = temp;
//            kthCounter++;
//            if (kthCounter == kth) {
//                return kthMaxValue;
//            }
//
//        }
//
//        return kthMaxValue;
//
//    }
//
//
//    public static int ThirdMax(int[] nums) {
//
//        Arrays.sort(nums);
//
//        int max = nums[nums.length-1];
//        int count = 0;
//        int index = 0;
//
//        if((nums.length <= 2))
//            return max;
//
//        else {
//            while((count != 3) && (index < nums.length)){
//                    if(max > nums[index]){
//                        max = nums[index];
//                        count++;
//                    }
//                    index++;
//                }
//            }
//
//        if((nums.length > 2) && (count == 1)){
//            max = nums[nums.length -1];
//        }
//        return max;
//
//    }
}
