package LeetCode.Solve2;

import java.util.ArrayList;
import java.util.Collections;

public class prob2057 {

    public static void main(String[] args) {

        int[] n = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};

        System.out.println(smallestEqual(n));

    }

    public static int smallestEqual(int[] nums) {

        int minIndexForNoIndexMatch = -1;
        ArrayList<Integer> indexHolder = new ArrayList<Integer>();
        for(int index = 0; index < nums.length; index++){
            if((index % 10) == nums[index]){
                indexHolder.add(index);
            }
        }

        if(indexHolder.isEmpty())
            return minIndexForNoIndexMatch;


        else
            return Collections.min(indexHolder);

    }
}
