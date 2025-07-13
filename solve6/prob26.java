import java.util.Arrays;

public class prob26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {

        Arrays.sort(nums);
        int[] uniqueArray = new int[nums.length];
        int numberFlag = nums[0];
        int uniqueArrayIndexCount = 0;
        uniqueArray[uniqueArrayIndexCount] = numberFlag;


        for (int index = 0; index < nums.length; index++){

            int currentNumber = nums[index]; 

            if ((numberFlag != currentNumber)){
                uniqueArrayIndexCount++;
                uniqueArray[uniqueArrayIndexCount] = nums[index];
                numberFlag = nums[index];
            }
        }

        for (int index = 0; index < nums.length; index++) {
            nums[index] = uniqueArray[index];
        }
        


        System.out.println(Arrays.toString(nums));
        return uniqueArrayIndexCount + 1;
    }
    
}