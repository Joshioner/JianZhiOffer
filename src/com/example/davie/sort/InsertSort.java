package com.example.davie.sort;

import java.util.Arrays;

/**
 * 直接插入算法（稳定算法）
 * 时间复杂度：O(N^2),最好时间复杂度O(N)--->有序 ,最坏时间复杂度O(N^2)
 * 空间复杂度：O(1)
 */
public class InsertSort {
    public static void sort(int[] nums){
        if (nums == null || nums.length == 1){
            return;
        }
        for (int i = 1;i < nums.length;i++){
            int j = i - 1;
            int tmp = nums[i];
            while (j >= 0 && nums[j] > tmp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5,6,7,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
