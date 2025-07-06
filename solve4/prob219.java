package LeetCode.solve4;

public class prob219 {

    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if(isTowDistinctIndexEqual(nums) && isLessOrEqualTok(nums, k)){
            return true;
        }
        return false;
    }

    public static boolean isTowDistinctIndexEqual(int[] nums) {

        for(int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++){
            for(int indexTravellerOfNums = 0; indexTravellerOfNums < nums.length; indexTravellerOfNums++){

                if(nums[indexOfNums] == nums[indexTravellerOfNums]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLessOrEqualTok(int[] nums, int k) {

        for(int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++){
            for(int indexTravellerOfNums = 0; indexTravellerOfNums < nums.length; indexTravellerOfNums++){

                if(Math.abs(indexOfNums - indexTravellerOfNums) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
