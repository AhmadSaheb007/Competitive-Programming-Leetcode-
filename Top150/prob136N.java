import java.util.Arrays;

public class prob136N {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        // int singleNumber = 0;
        int index = 0; 
        while(index < nums.length -1){
            if(nums[index] != nums[index + 1]){
                return nums[index];
            }
            index = index + 2;
        }
        return nums[nums.length -1];
    }
}
