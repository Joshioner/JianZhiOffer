package com.example.davie.sort;

import java.util.Arrays;

public class ShellSort {
    public static void sort(int[] nums){
        if (nums == null || nums.length == 1){
            return;
        }
        int gap = nums.length / 2;
        while (gap > 0){
            for (int i = gap ;i < nums.length;i++){
                int j = i - gap;
                int tmp = nums[i];
                while (j >= 0 && nums[j] > tmp){
                    nums[j+gap] = nums[j];
                    j = j - gap;
                }
                nums[j+gap] = tmp;
            }
            gap = gap / 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,3,4,5,6,7,8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
