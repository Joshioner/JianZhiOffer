package com.example.davie.jianZhiOffer;

public class ReversePairs51 {
    public int reversePairs(int[] nums) {
         if(nums.length <= 1){
             return 0;
         }
         int count = 0;
         for (int i = 0;i < nums.length;i++){
             for (int j = i + 1;j < nums.length;j++){
                 if (nums[i] > nums[j]){
                     count++;
                 }
             }
         }
         return count;
    }
}
