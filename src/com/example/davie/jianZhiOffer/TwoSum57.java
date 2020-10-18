package com.example.davie.jianZhiOffer;

import java.util.Arrays;

public class TwoSum57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1){
            return new int[0];
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            int res = nums[i] + nums[j];
            if (res == target){
                return new int[]{nums[i],nums[j]};
            }else if (res > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[0];

    }
    public int binarySearch(int target,int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (nums[mid] == target){
                return target;
            }
            if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
