package LeetCode.solve5;

public class prob153 {
    public static void main(String[] args) {

    }

    public int mergeRecursive(int[] nums, int startingIndex, int lastIndex) {


        if(startingIndex < lastIndex){

            int midIndex = (startingIndex + lastIndex) / 2;

            mergeRecursive(nums, startingIndex, midIndex);
            mergeRecursive(nums, midIndex + 1, lastIndex);

            //merge(mergeRecursive(nums, startingIndex, midIndex), );
        }

        return 0;

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        /*
           We will use three pointer to point the specific point those are
           accordingly pointer at last index of nums1(m + n -1), pointer at
           nums1's index of (m - 1)as well as at nums2's index of (n - 1).
           In three cases we will subtract 1(Due to arrayOutOfIndexException).
           Then we will check which one between nums1[m - 1] & nums2[n - 1] will
           greater and place the value at the index of nums1.
        */

        // Initializing all required indexes . . . . . . . .
        int  indexOfNums1 = (m - 1), indexOfNums2 = (n - 1);

        // Using a loop to check greater element between nums1[m - 1] & nums2[n - 1] . . . . . . .
        for(int indexOfNum1 = (m + n - 1); indexOfNums2 >= 0; indexOfNum1--){

            if((indexOfNums1 >= 0) && (nums1[indexOfNums1] < nums2[indexOfNums2])){

                nums1[indexOfNum1] = nums1[indexOfNums1--];

            }
            else{

                nums1[indexOfNum1] = nums2[indexOfNums2--];

            }
        }

    }
}
