package com.example.davie.leetCode.easy;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
       if (nums.length == 0){
           return new int[]{};
       }
       int total = 0;
       for (int i = 0;i < nums.length;i++){
           total += nums[i];
           nums[i] = total;
       }
       return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
