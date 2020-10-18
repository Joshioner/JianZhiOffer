package com.example.davie.leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class NumIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
       if (nums == null || nums.length == 0){
           return 0;
       }
        Map<Integer,Integer> map = new HashMap<>();
        for (int value : nums) {
            map.put(value,map.getOrDefault(value,0) + 1);
        }
        int[] total = {0};
        map.forEach((key,value)->{
            if (value > 1){
                total[0] += (value * (value - 1)) / 2;
            }
        });
        return total[0];
    }
}
