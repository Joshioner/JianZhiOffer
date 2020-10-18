package com.example.davie.jianZhiOffer;

public class Exchange21 {
    public int[] exchange(int[] nums) {
       if (nums.length <= 0){
           return new int[]{};
       }
       int i = 0;
       int j = nums.length - 1;
       while (i < j){
           while (i < j && nums[i] % 2 == 1) i++;
           while (i < j && nums[j] % 2 == 0) j--;
           int tmp = nums[j];
           nums[j] = nums[i];
           nums[i] = tmp;
       }
       return nums;
    }
}
