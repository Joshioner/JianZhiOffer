package com.example.davie.jianZhiOffer;

public class MaxProfit63 {
    public int maxProfit(int[] prices) {
         if (prices == null || prices.length <= 1){
             return 0;
         }
         int maxProfit = 0;
         int minPrice = prices[0];
         for (int i = 1;i < prices.length ;i++){
             minPrice = Math.min(prices[i],minPrice);
             maxProfit = Math.max(maxProfit,prices[i] - minPrice);
         }
         return maxProfit;
    }
}
