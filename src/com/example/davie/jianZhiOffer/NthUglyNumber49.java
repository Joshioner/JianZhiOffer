package com.example.davie.jianZhiOffer;

public class NthUglyNumber49 {
    public int nthUglyNumber(int n) {
       if (n <= 6){
           return n;
       }
       int[] nums = new int[n];
       nums[0] = 1;
       int i2 = 0,i3 = 0,i5 = 0;
       for (int i = 1; i < n;i++){
           nums[i] = Math.min(nums[i2] * 2,Math.min(nums[i3] * 3,nums[i5] * 5));
           if (nums[i] == nums[i2] * 2)
               i2++;
           if (nums[i] == nums[i3] * 3)
               i3++;
           if (nums[i] == nums[i5] * 5)
               i5++;
       }
       return nums[n - 1];
    }
}
