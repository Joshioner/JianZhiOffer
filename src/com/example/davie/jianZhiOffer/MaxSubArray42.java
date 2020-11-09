package com.example.davie.jianZhiOffer;

public class MaxSubArray42 {
    public int maxSubArray(int[] nums) {
      if(nums.length <= 1){
          return nums.length == 0 ? 0 : nums[0];
      }
      int[] dp = new int[nums.length];
      dp[0] = nums[0];
      int max = nums[0];
      for (int i = 1;i<nums.length;i++){
          dp[i] = dp[i - 1] > 0 ? dp[i - 1] + nums[i] : nums[i];
          max = Math.max(dp[i],max);
      }
      return max;
    }
}
