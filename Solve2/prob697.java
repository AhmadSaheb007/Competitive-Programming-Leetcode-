package LeetCode.Solve2;

public class prob697 {

    public static void main(String[] args) {

        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1}));

    }

    public static int findShortestSubArray(int[] nums) {

        int counterHelper = 1;
        int maxRepeatationHolder = 1;
        for(int index = 0; index < nums.length; index++){

            int counter = 0;
            for(int number = 0; number < nums.length; number++){
                if(nums[index] == nums[number]){
                    counter++;
                }
            }
            if(counter > counterHelper){
                counterHelper = counter;
                maxRepeatationHolder = nums[index];
            }
        }

        return maxRepeatationHolder * counterHelper;

    }
}
