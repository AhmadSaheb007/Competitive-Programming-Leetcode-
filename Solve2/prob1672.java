package LeetCode.Solve2;

public class prob1672 {

    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] accounts) {

        int maxAmount = accounts[0][0];

        for(int row = 0; row < accounts.length; row++) {
            int totalAmount = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                totalAmount = totalAmount + accounts[row][col];
            }

            if (maxAmount < totalAmount) {
                maxAmount = totalAmount;
            }
        }

        return maxAmount;

    }
}

