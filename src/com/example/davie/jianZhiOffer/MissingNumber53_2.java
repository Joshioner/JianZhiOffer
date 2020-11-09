package com.example.davie.jianZhiOffer;

public class MissingNumber53_2 {
    public int missingNumber(int[] nums) {
       if (nums.length == 0){
           return 0;
       }
       int left = 0,right = nums.length - 1;
       while (left <= right){
           int mid = (left + right) / 2;
           if (mid == nums[mid]){
               left = mid + 1;
           }else {
               right = mid - 1;
           }
       }
       return left;
    }
}
