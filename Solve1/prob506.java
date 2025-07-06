//package LeetCode.Solve;
//
//import java.util.Arrays;
//
//public class prob506 {
//
//    public static void main(String[] args) {
//
//        int[] s = {1,4,5,2,3};
//
//        System.out.println(Arrays.toString(findRelativeRanks(s)));
//
//    }
//
//    public static String[] findRelativeRanks(int[] score) {
//
//        String[] rankString = new String[score.length];
//        int count =0;
//
//        for(int index = 0; index < score.length; index++){
//            count++;
//
//            switch (count){
//                case 1:
//                    rankString[] = "Gold Madel";
//                    break;
//                case 2:
//                    rankString[index] = "Silver Medal";
//                    break;
//                case 3:
//                    rankString[index] = "Bronze Medal";
//                    break;
//                case 4:
//                    rankString[index] = "4";
//                    break;
//                case 5:
//                    rankString[index] = "5";
//                    break;
//                default:
//                    // void
//            }
//            score[index] = -999999999;
//        }
//
//        return rankString;
//
//    }
//}
