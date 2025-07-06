package LeetCode.solve5;

import java.util.*;

public class prob1636 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(frequencySort(new int[]{2, 3, 3, 3, 2, -1, 2, 2, 5})));

    }



    public static int[] frequencySort(int[] nums) {

        //HashSet<Integer> uniqueNumberHolder = new HashSet<>();
        HashMap<Integer, Integer> numberFrequencyHolder = new HashMap<>();

        for (int indexOfNums = 0; indexOfNums < nums.length; indexOfNums++) {

            int previousCount;
            try {
                previousCount = numberFrequencyHolder.get(nums[indexOfNums]);
            } catch(NullPointerException e) {
                previousCount = 0;
            }

            numberFrequencyHolder.put(nums[indexOfNums], previousCount + 1);

        }

        ArrayList<Integer> sortedByFrequency = new ArrayList<>();
        LinkedList<Integer> KeySetFromMap = new LinkedList<>(numberFrequencyHolder.keySet());
        KeySetFromMap.sort(Collections.reverseOrder());

        for(int number1 : numberFrequencyHolder.values()){

            int minimumFrequency = Integer.MAX_VALUE;
            int minimumRepeatedNumber = 0;
            
            for(int number2 : KeySetFromMap){

                if(minimumFrequency > numberFrequencyHolder.get(number2)){
                    minimumFrequency = numberFrequencyHolder.get(number2);
                    minimumRepeatedNumber = number2;
                }
            }
            numberFrequencyHolder.put(minimumRepeatedNumber, Integer.MAX_VALUE);

            for(int numberRepetition = 0; numberRepetition < minimumFrequency; numberRepetition++){
                sortedByFrequency.add(minimumRepeatedNumber);
            }
        }

        int[] sortedFrequencyArray = new int[sortedByFrequency.size()];

        for(int index = 0; index < sortedFrequencyArray.length; index++){
            sortedFrequencyArray[index] = sortedByFrequency.get(index);
        }

        return sortedFrequencyArray;
    }

    public static HashMap<Integer, Integer> sortHashMap(HashMap<Integer, Integer> numberFrequencyHolder){

        //HashMap<Integer, Integer> sortByValueOfNumberFrequencyHolder= new HashMap<>();
        HashSet<Map.Entry<Integer, Integer>> entrySet;
        entrySet = (HashSet<Map.Entry<Integer, Integer>>) numberFrequencyHolder.entrySet();

        List<Map.Entry<Integer, Integer>> setList = new ArrayList<>(entrySet);

        Collections.sort(setList, new Comparator<Map.Entry<Integer, Integer>>() {
           @Override
           public int compare(Map.Entry<Integer, Integer> object1, Map.Entry<Integer, Integer> object2) {
               return (object1.getValue()).compareTo(object1.getValue());
           }
        });

        HashMap<Integer, Integer> sortByValueOfNumberFrequencyHolder = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> mapSet : setList) {
            sortByValueOfNumberFrequencyHolder.put(mapSet.getKey(), mapSet.getValue());
        }
        return sortByValueOfNumberFrequencyHolder;
    }

}
