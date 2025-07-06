package LeetCode.Solve;

public class probs169 {
    public static void main(String[] args) {

        int[] n = {1, 2, 4, 1, 6, 1, 1};

        System.out.println(majorityElement(n));

    }

    public static int majorityElement(int[] nums) {

        int majorElement = nums[0];
        int majorityCounter = 1;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] == majorElement){
                majorityCounter++;
            }
            else {
                majorityCounter--;
            }
            if(majorityCounter == 0){
                majorElement = nums[index];
                majorityCounter = 1;
            }
        }
        return majorElement;
    }
}
