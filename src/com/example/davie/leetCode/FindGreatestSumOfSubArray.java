package com.example.davie.leetCode;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array ==null|| array.length <= 0){
            return 0;
        }
        int[] res = new int[array.length];
        res[0] = array[0];
        int maxNum = res[0];
        for (int i = 1;i < array.length;i++){
             res[i] = res[i - 1] > 0 ? res[i - 1] + array[i] : array[i];
             maxNum = Math.max(maxNum,res[i]);
        }
        return maxNum;
    }
}
