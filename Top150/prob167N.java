
public class prob167N {
    public static void main(String[] args) {

        System.out.println(abc(new int[]{2, 7, 11, 15},  9));


    
    }


    public static int[] abc(int[] numbers, int target) {

        // Here we are using two pointers to find the two numbers that add up to the target.
        // Since the array is sorted, we can use a two-pointer approach to find the solution

        int left = 0; // Start pointer at the beginning of the array
        int right = numbers.length - 1; // End pointer at the end of the array
        int[] result = new int[2]; // Array to store the result indexes

        // Loop until the two pointers meet

        while (left < right) {

            if((numbers[left] + numbers[right]) == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;

            }

            else if ((numbers[left] + numbers[right]) < target){
                left++;
            }
            else {
                right--;
            }
        }
        
        return result;
    }
}
