package LeetCode.Solve3;

public class prob335 {

    public static void main(String[] args) {

    }

    public boolean isSelfCrossing(int[] distance) {

        for(int index = 3; index < distance.length; index++){

            if(distance[index] < distance[index - 2]){
                return false;
            }
        }
        return true;
    }
}
