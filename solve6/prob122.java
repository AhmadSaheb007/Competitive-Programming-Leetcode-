public class prob122 {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        // This will be a greedy approach to find the maximum profit
        // by buying and selling the stock multiple times. We will take
        // a value from the array and compare it with the next value.
        // If the next value is greater than the current value, we will
        // add the difference to the maximum profit. if the next value is
        // less than the current value, we will not do anything and just 
        // move to the next value . . . . . . . . 

        //Ex: prices = [7, 1, 5, 3, 6, 4]
        // Compare 7 and 1, do nothing, because 1 < 7; a negative value is not allowed
        // Compare 1 and 5, add (5 - 1) = 4, add to maxProfit
        // Compare 5 and 3, do nothing, because 3 < 5
        // Compare 3 and 6, add (6 - 3) = 3, add to maxProfit
        // Compare 6 and 4, do nothing, because 4 < 6; a negative value is not allowed
        // The maximum profit will be 4 + 3 = 7 . . . . . .
        // Initialize variables to keep track of maximum profit and minimum price . . . . . .


        int maxProfit = 0; // Iniitial maximum profit to 0 . . . . . 
        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to the maximum possible value . . . . . .


        // Loop through the prices array
        for(int index = 0; index < prices.length; index++) {

            int currentPrice = prices[index]; // Get the current price form the array index . . . . . . 

            // If the current price is less than the minimum price, update the minimum price
            if (currentPrice < minPrice) {
                 minPrice = currentPrice;
            }

            // If the current price is greater than the minimum price, calculate the profit
            // and update the maximum profit. Upodate the minimum price to the current price
            // to allow for the next potential profit calculation . . . . . . 
            if (minPrice < currentPrice) {
                maxProfit = maxProfit + (currentPrice - minPrice);
                minPrice = currentPrice;
            }

        }

        return maxProfit; // Return the maximum profit calculated . . . . . .
    }
}
