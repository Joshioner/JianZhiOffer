package com.example.davie.leetCode;

public class MaxProfit_121 {
    public int maxProfit(int[] prices) {
       if (prices ==null || prices.length < 2){
           return 0;
       }
       int min = Integer.MAX_VALUE;
       int maxProfile = 0;
       for (int i = 0;i < prices.length;i++){
           min = Integer.min(prices[i],min);
           maxProfile = Math.max(maxProfile,prices[i] - min);
       }
       return maxProfile;
    }
}
