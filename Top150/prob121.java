import java.util.Arrays;

public class prob121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    //This Java function calculates the maximum possible profit from buying and selling a stock once,
    // given an array of daily prices. It iterates through the prices, keeping track of the minimum
    // price seen so far (buyDay) and the maximum profit that can be made by selling at the current
    //price (maxProfit).

    public static int maxProfit(int[] prices) {
        int maxProfit = 0; // As per return statement, assume profit is 0 (zero) . . . .

        int buyDay = prices[0]; // Assuming very first value in the arrary is buyinh day . . . .

        // Iterating over all days in the prices array. . . . . .
        for(int index = 1; index < prices.length; index++){

            // If the day value of particular index in price array < buying day
            // then, buyday value will replace by new smaller founded day.
            // Becasue selling day can't comes before buying day . . . . . .  
            if(prices[index] < buyDay){
                buyDay = prices[index];
            }

            // Now if current indexed, day value - founded buying day value > maxProfit
            //  maxProfit == prices[index] - buyDay . . . . . . 
            else if(prices[index] - buyDay > maxProfit){
                maxProfit = prices[index] - buyDay;
            }
        }

        return maxProfit; // return maximum profit . . . . .
    }
}
