package com.example.davie.jianZhiOffer;

public class Search53_1 {
    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int count = 0;
        for (Integer num:nums){
            if (target == num){
                count++;
            }
        }
        return count;
    }
}
