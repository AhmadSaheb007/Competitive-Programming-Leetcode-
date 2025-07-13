public class probs169 {
    public static void main(String[] args) {

        int[] n = {1, 2, 4, 1, 6, 1, 1};

        System.out.println(majorityElement(n));

    }

    public static int majorityElement(int[] nums) {

        // Here we are going for the Boyer-Moore Voting Algorithm approach.
        // The idea is to maintain a count of the current majority element and
        // reset it when the count reaches zero. The element that remains at the end
        // will be the majority element. . . . . . . .

        int majorityCount = 0; // How many times a numbers reapets . . . . . . 
        int currentMajorElement = 0; // The current majority element . . . . . . . .

        for(int index = 0; index < nums.length; index++){

            // If the count is zero, we set the current element as the majority element
            // and increment the count. If the current element is the same as the majority
            if(majorityCount == 0){
                currentMajorElement = nums[index];
                majorityCount++;
                continue;
            }

            // If the current element is the same as the majority element, we increment the count
            // Otherwise, we decrement the count.
            if(nums[index] == currentMajorElement){
                majorityCount++;
            } 
            else {
                majorityCount--;
            }
        }
        
        // At the end of the loop, the currentMajorElement will be the majority element
        // because it has been counted more than half the time in the array.
        return currentMajorElement;

    }
}
