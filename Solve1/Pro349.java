
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Pro349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        /*
          First we will store all common elements in a HashSet, so that we can get only
          unique elements. Then we will convert HashMap into ArrayList. After that, we
          will convert this ArrayList into Array due to the returning condition of the
          question as well as function . . . . .
         */

        // "storeUniqueElements" will return uniques set of elements . . . . .
        HashSet<Integer> storeUniqueElements = new HashSet<>();

        // Adding unique elements of two sets in to HashSet . . . . . .
        for(int indexN1 = 0; indexN1 < nums1.length; indexN1++){
            for(int indexN2 = 0; indexN2 < nums2.length; indexN2++){

                if(nums1[indexN1] == nums2[indexN2]){
                    storeUniqueElements.add(nums1[indexN1]);
                }

            }
        }

        // converting HashSet into ArrayList . . . . . . .
        ArrayList<Integer> intersectedArrayList = new ArrayList<Integer>(storeUniqueElements);

        // Converting ArrayList into array . . . .  . . .
        int[] intersectedArray = new int[intersectedArrayList.size()];
        for(int index = 0; index < intersectedArray.length; index++){

            intersectedArray[index] = intersectedArrayList.get(index);

        }
        // Returning array containing unique elements . . . . . . .
        return intersectedArray;
    }
    
}
