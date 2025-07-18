public class prob55 {
    public static void main(String[] args) {
        // int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        // int[] nums = {0, 3};
        // int[] nums = {3};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {

        // In this problem, we will use a greedy approach to determine if we
        // can reach the last index of the array. We will keep track of the
        // maximum index we can reach at each step. If we can reach the last
        // index, we will return true; otherwise, we will return false. . . . . . .

        int index = 0; // Initialize the index to 0, which is the starting point of the array . . . . .
        int totalReach = 0; // Initialize the total reach to 0 . . . . .

        // Loop through the array until we reach the end or until we can no longer move forward
        // We will update the total reach at each step by comparing the current index and the value
        while (index <= totalReach) {
            totalReach = Math.max(totalReach, index + nums[index]);
            if (totalReach >= nums.length - 1) {
                return true;
            }
            index++;
        }

        return false;
    }
}
