package LeetCode.Solve2;

public class prob1450 {

    public static void main(String[] args) {

    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int studentCounter = 0;

        for(int index = 0; index < startTime.length; index++){
            if((startTime[index] < queryTime) && (queryTime < endTime[index])){
                studentCounter++;
            }
        }

        return studentCounter;

    }
}
