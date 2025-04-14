package org.example.classbox;

public class BestTimeToBuyStock {
    int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }

    public int maxProfitsBetter(int[] prices){
        int profit = 0;
        int minPrice = Integer .MAX_VALUE;

        for(Integer p : prices){
            minPrice = Math.min(minPrice, prices[p] );
            int maxPrice = Math.max(profit, prices[p] - minPrice);
        }

        return profit;
    }
}
