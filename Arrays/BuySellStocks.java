package arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else
                profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }
}
