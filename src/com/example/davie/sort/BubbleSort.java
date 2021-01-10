package com.example.davie.sort;

import java.util.Arrays;
/**
 * 选择排序算法（稳定排序）
 * 时间复杂度：O(N^2),最好时间复杂度O(N)--->有序 ,最坏时间复杂度O(N^2)--->逆序
 * 空间复杂度：O(1)
 *
 */
public class BubbleSort {
    public static void sort(int[] nums){
        if (nums == null || nums.length == 0){
            return;
        }
        boolean flag = false;
        for (int i = 0 ;i < nums.length - 1;i++){
            for (int j = 0;j < nums.length - 1 -i;j++){
                if (nums[j] > nums[j + 1]){
                    flag = true;
                    swap(nums,j,j+1);
                }
            }
            if (!flag){
                return;
            }
        }
        return;
    }
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5,6,7,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
