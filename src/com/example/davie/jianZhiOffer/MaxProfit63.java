package com.example.davie.jianZhiOffer;

public class MaxProfit63 {
    public int maxProfit(int[] prices) {
         if (prices == null || prices.length <= 1){
             return 0;
         }
         int maxPrice = 0;
         int min = prices[0];
         for (int i = 1;i < prices.length;i++){
             min = Math.min(min,prices[i]);
             maxPrice = Math.max(maxPrice,prices[i] - min);
         }
         return maxPrice;
    }
}
