package LeetCode.solve4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class prob2007 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findOriginalArray(new int[]{1, 3, 4, 2, 6, 8})));

    }

    public static int[] findOriginalArray(int[] changed) {

        Arrays.sort(changed);
        HashSet<Integer> originalElementSet = new HashSet<>();

        for(int index1 = 0; index1 < changed.length; index1++){
            for(int index2 = 0; index2 < changed.length; index2++){

                if((2 * changed[index1]) == changed[index2]){

                    originalElementSet.add(changed[index1]);

                }

            }
        }

        ArrayList<Integer> originalElementArrayList = new ArrayList<>(originalElementSet);
        int[] originalArray = new int[originalElementArrayList.size()];

        for(int index = 0; index < originalArray.length; index++){
            originalArray[index] = originalElementArrayList.get(index);
        }

        return originalArray;

    }
}
