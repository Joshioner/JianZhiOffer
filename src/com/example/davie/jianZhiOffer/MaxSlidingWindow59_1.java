package com.example.davie.jianZhiOffer;

import java.util.Arrays;

public class MaxSlidingWindow59_1 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
       if (nums.length ==0 || k <= 1){
           return nums;
       }
//       if (k > nums.length){
//           //直接遍历，找到最大值
//       }
       int[] result = new int[nums.length - k + 1];
       for (int i = 0;i < result.length;i++){
           int max = nums[i];
           for (int j = i + 1;j < i + k;j++){
               if (nums[j] > max){
                   max =nums[j];
               }
           }
           result[i] = max;
       }
       return result;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }
}
