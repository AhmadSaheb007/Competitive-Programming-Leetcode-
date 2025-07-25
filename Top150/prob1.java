import java.util.HashMap;

public class prob1 {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3,2,4}, 6);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        // This is a greedy approach to solve the Two Sum problem.
        // We want to find two numbers in the array that add up to the target.
        // To do this efficiently, we'll use a HashMap to store each number . . . . . . .

        // as we iterate, along with its index. On each iteration, we calculate
        // the complement (target - current number), and check if that complement
        // already exists in the map. If it does, we've found the two numbers,
        // so we return their indices. Otherwise, we store the current number
        // in the map and move to the next one. . . . . . .

        // Example: nums = [3, 2, 4], target = 6
        // First iteration: index = 0, number = 3, complement = 6 - 3 = 3
        // → Map is empty, so nothing happens. Store (3, 0).
        // Second iteration: index = 1, number = 2, complement = 6 - 2 = 4
        // → 4 not in map. Store (2, 1).
        // Third iteration: index = 2, number = 4, complement = 6 - 4 = 2
        // → 2 *is* in map at index 1. So we return [1, 2].

        int[] indexHolder = new int[2]; // Array to store the result indexes . . . . .

        HashMap<Integer, Integer> numsMAP = new HashMap<>(); // Map to store numbers and their indices . . . . . .

        // Iterate through the array and find the remaining value from target - nums[index] . . . . . .
        for (int index = 0; index < nums.length; index++) {
            int remainingValue = target - nums[index]; // calculate the remaining value . . . . . .

            if (numsMAP.containsKey(remainingValue)) { // Check if the remaining value is in the map
                indexHolder[0] = numsMAP.get(remainingValue); // Get the index of the remaining value
                indexHolder[1] = index; // Get the index of the current number
                break;
            }
            numsMAP.put(nums[index], index); // Put into the Hashmap of the current number and its index . . . . . .

        }

        return indexHolder; // Return the result
    }
}
