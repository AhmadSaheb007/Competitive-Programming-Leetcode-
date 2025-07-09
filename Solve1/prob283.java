

public class prob283 {

    public static void main(String[] args) {

        moveZeroes(new int[]{1, 0, 3, 0, 12});

    }

    public static void moveZeroes(int[] nums) {

        int[] newArray = new int[nums.length];
        int indexOfNewArray = 0;
        for (int index1 = 0; index1 < nums.length; index1++) {

            if(nums[index1] != 0){
                newArray[indexOfNewArray] = nums[index1];
                indexOfNewArray++;
            }
        }
        System.arraycopy(newArray, 0, nums, 0, nums.length);

    }
}
