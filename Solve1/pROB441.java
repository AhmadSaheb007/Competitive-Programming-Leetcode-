package LeetCode.Solve;

public class pROB441 {

    public static void main(String[] args) {

        System.out.println(arrangeCoins(10));

    }

    public static int arrangeCoins(int n){

        int row = 1;
        int count = 0;
        for(int index = 1, x = 0; index <= n || x< index; index++,x++){
            for(int j = 0; j < index; j++){
                count++;
            }
            if(count > n){
                return index - 1;
            }
            else if(count == n){
                return index;
            }
        }

        return 0;

    }









//    public static int arrangeCoins(int n) {
//
//        for(int rowNumber = 1; rowNumber < n; rowNumber++){
//            if(((n/rowNumber) + 1) < rowNumber){
//
//                return  rowNumber - 1 ;
//
//            }
//
//            else if(((n/rowNumber) + 1) == rowNumber){
//
//                return  rowNumber;
//
//            }
//        }
//        return 1;
//    }



//    public int arrangeCoins(int n) {
//
//    }
}
