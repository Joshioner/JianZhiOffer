package com.example.davie.toutiao;

public class LengthOfLIS_300 {
    public int lengthOfLIS(int[] nums) {
         if (nums == null || nums.length <= 0 ){
             return 0;
         }
         int[] dp = new int[nums.length];
         for (int i = 0;i < nums.length;i++){
             dp[i] = 1;
         }
         int maxLen = 1;
         for (int i = 0;i < nums.length;i++){
             for (int j = 0; j < i;j++){
                 if (nums[i] > nums[j]){
                     dp[i] = Math.max(dp[i],dp[j] + 1 );
                 }
             }
             maxLen = Math.max(maxLen,dp[i]);
         }
         return maxLen;
    }
}
