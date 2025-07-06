package LeetCode.Solve2;

public class prob896 {

    public static void main(String[] args) {

        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));

    }
    public static boolean isMonotonic(int[] nums) {

       if(isIncreasing(nums)){
           return true;
       }
       else if(isDecreasing(nums)){
           return true;
       }

       return false;
    }

    public static boolean isIncreasing(int[] nums){
        for(int index = 0; index < (nums.length -1); index++){
            if(nums[index] > nums[index + 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] nums){
        for(int index = 0; index < (nums.length -1); index++){
            if(nums[index] < nums[index + 1]){
                return false;
            }
        }
        return true;
    }
}
