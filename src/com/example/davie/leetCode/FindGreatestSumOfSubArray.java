package com.example.davie.leetCode;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array ==null|| array.length <= 0){
            return 0;
        }
        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int value:array){
            currentMax = currentMax > 0 ? currentMax + value:value;
            maxSum = Math.max(currentMax,maxSum);
        }
        return maxSum;
    }
}
