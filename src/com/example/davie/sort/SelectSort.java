package com.example.davie.sort;

import java.util.Arrays;

/**
 * 选择排序算法（不是稳定排序）
 * 时间复杂度：O(N^2),最好时间复杂度O(N^2) ,最坏时间复杂度O(N^2)
 * 空间复杂度：O(1)
 *
 */
public class SelectSort {
    public static void sort(int[] nums){
        if (nums == null || nums.length == 0 ){
            return;
        }
        for (int i = 0;i < nums.length;i++){
            for (int j = i + 1; j < nums.length;j++){
                if (nums[i] > nums[j]){
                  swap(nums,i,j);
                }
            }
        }
        return;
    }

    //交换数字的三种实现
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

//    public void swap(int[] nums,int i,int j){
//        nums[i] = nums[i] + nums[j];
//        nums[j] = nums[i] - nums[j];
//        nums[i] = nums[i] - nums[j];
//    }
//
//    public void swap(int[] nums,int i,int j){
//        nums[i] = nums[i] ^ nums[j];
//        nums[j] = nums[i] ^ nums[j];
//        nums[i] = nums[i] ^ nums[j];
//    }
    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5,6,7,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

