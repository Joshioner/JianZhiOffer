package com.example.davie.sort;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] nums){
        if (nums == null || nums.length <= 1){
            return;
        }
      sort(nums,0,nums.length - 1);
    }

    public static void sort(int[] nums,int left,int right){
        if (right - left + 1 < 2){
            return ;
        }
        int mid = left + (right - left) / 2;
        sort(nums,left,mid);
        sort(nums,mid + 1,right);
        merge(nums,left,mid,right);
    }
    public static void merge(int[] nums,int left,int mid,int right){
        int[] res = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int start = 0;
        while (i <= mid && j <= right){
            if (nums[i] < nums[j]){
                res[start++] = nums[i++];
            }else {
                res[start++] = nums[j++];
            }
        }
        while (i <= mid){
            res[start++] = nums[i++];
        }
        while (j <= right){
            res[start++] = nums[j++];
        }
        for (int index = 0;index < res.length;index++){
            nums[index + left] = res[index];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5,6,7,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
