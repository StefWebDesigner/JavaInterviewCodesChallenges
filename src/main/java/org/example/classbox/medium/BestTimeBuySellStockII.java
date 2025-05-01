package org.example.classbox.medium;

public class BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        //Go into the loop
        for (int i = 1; i < prices.length; ++i) {
            //Find the price is bigger or smaller
            int dailyProfit = Math.max(0, prices[i] - prices[i - 1]);
            totalProfit += dailyProfit;
        }
        return totalProfit;
    }
}
