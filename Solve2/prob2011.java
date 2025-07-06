package LeetCode.Solve2;

public class prob2011 {

    public static void main(String[] args) {

    }

    public static int finalValueAfterOperations(String[] operations) {

        int ans = 0;
        for(int index = 0; index < operations.length; index++){

            if(operations[index].equals("X++")){
                ans++;
            }
            else if(operations[index].equals("++X")){
                ans++;
            }
            else if(operations[index].equals("X--")){
                ans--;
            }
            else if(operations[index].equals("--X")){
                ans--;
            }

        }

        return ans;

    }
}
