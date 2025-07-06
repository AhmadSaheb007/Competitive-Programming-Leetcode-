package LeetCode.Solve3;

import java.util.ArrayList;

public class prob27 {

    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3, 2, 4, 3, 1, 0, 3, 3}, 3));

    }

    public static int removeElement(int[] nums, int val) {

        int[] newArray = new int[nums.length];
        int indexOfNewArray = 0;
        for (int index1 = 0; index1 < nums.length; index1++) {

            if(nums[index1] != val){
                newArray[indexOfNewArray] = nums[index1];
                indexOfNewArray++;
            }
        }

        System.arraycopy(newArray, 0, nums, 0, nums.length);
        return indexOfNewArray;
    }
}

//    public static int removeElement(int[] nums, int val) {
//
//
//        ArrayList<Integer> removeElementArray = new ArrayList<Integer>();
//
//        for(int index1 = 0; index1 < nums.length; index1++){
//
//            if(nums[index1] != val){
//                removeElementArray.add(nums[index1]);
//
//            }
//        }
//
//        int[] arr = removeElementArray.toArray();
//        return removeElementArray.size() ;
//
//    }
//}
