package LeetCode.solve5;

public class prob2006 {

    public static void main(String[] args) {

    }


    public int countKDifference(int[] nums, int k) {

        int differenceCounter = 0;

        for(int index = 0; index < nums.length; index++){
            for(int indexTraveller = 0; indexTraveller < nums.length; indexTraveller++){

                if(Math.abs(nums[index] - nums[indexTraveller]) == k){
                    differenceCounter++;
                }

            }
        }

        return differenceCounter;

    }
}
