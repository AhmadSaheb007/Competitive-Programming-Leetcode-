package LeetCode.solve4;

import java.util.*;

public class prob2418 {

    public static void main(String[] args) {

        String[] n = {"abeer", "Shadman", "Ahmad"};
        int[] h = {4, 6, 1};

        System.out.println(Arrays.toString(sortPeople(n, h)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {

        /*
           First we will take a hashMap "storeNameWithHeight" to map names
           with respect to height, then we will sort the height array in
           reverse order. After that, we will store the names in "sortedNames"
           from sorted height array and return "sortedNames" array . . . . . . .
        */

        // Creating a HashMap and map names array with respect to heights array . . . .
        HashMap<Integer, String> storeNameWithHeight = new HashMap<>();

        for(int indexOfHashMap = 0; indexOfHashMap < names.length; indexOfHashMap++){
            storeNameWithHeight.put(heights[indexOfHashMap], names[indexOfHashMap]);
        }

        // Converting int array to Integer array . . . . . .
        Integer[] heightInInteger = new Integer[heights.length];

        for(int indexOfHeightInteger = 0; indexOfHeightInteger < heightInInteger.length; indexOfHeightInteger++){
            heightInInteger[indexOfHeightInteger] = heights[indexOfHeightInteger];
        }

        // Sorting the array in reverseOrder(descending order) . . . . . .
        Arrays.sort(heightInInteger, Collections.reverseOrder());

        // Creating a String array and holding sorted names as per as the condition . . . . . .
        String[] sortedNames = new String[names.length];

        for (int indexOfSortedNames = 0; indexOfSortedNames < sortedNames.length; indexOfSortedNames++) {
            sortedNames[indexOfSortedNames] = storeNameWithHeight.get(heightInInteger[indexOfSortedNames]);
        }

        return sortedNames;
    }
}
