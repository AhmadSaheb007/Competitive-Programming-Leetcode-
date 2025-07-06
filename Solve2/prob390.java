package LeetCode.Solve2;

public class prob390 {

    public static void main(String[] args) {

    }

//    public static int lastRemaining(int n) {
//
//        int[] numsHolder = new int[n];
//        numsHolder = nSerialNumber(n);
//
//        for(int index = 1; index <= numsHolder.length; index++){
//            if(numsHolder[index] > 0){
//                numsHolder[index] = 0;
//            }
//        }
//
//    }

    public static int[] nSerialNumber(int n) {
        int[] numberHolder = new int[n];
        for(int index = 1; index <= n; index++){
            numberHolder[index] = index;
        }

        return numberHolder;
    }
}
