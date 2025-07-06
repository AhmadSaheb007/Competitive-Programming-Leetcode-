package LeetCode.Solve2;

public class prob2053 {

    public static void main(String[] args) {

    }

    public String kthDistinct(String[] arr, int k) {

        int distinctCounter = 0;
        for(int index = 0; index < arr.length; index++){

            if(checkRepeatedString(arr, arr[index])){
                distinctCounter++;
            }
            if(distinctCounter == k){
                return arr[index];
            }

        }
        return "";
    }

    public boolean checkRepeatedString(String[] arr, String indexString) {

        int counter = 0;
        for(int index = 0; index < arr.length; index++){

            if(indexString.equals(arr[index])){
                counter++;
            }
        }

        if(counter > 1){
            return false;
        }
        return true;

    }
}
