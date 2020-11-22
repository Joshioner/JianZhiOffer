package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber03 {
    public static int findRepeatNumber(int[] nums) {
        if (nums.length <= 0){
            return 0;
        }
//        Map<Integer,Integer> num2CountMap = new HashMap<>();
//        for (int num : nums) {
//          num2CountMap.put(num,num2CountMap.getOrDefault(num,0) + 1);
//          if (num2CountMap.get(num) >= 2){
//              return num;
//          }
//        }
//        return 0;
        for (int i = 0;i < nums.length;i++){
            //交换位置
            if (nums[i] != i){
                 if (nums[i] == nums[nums[i]]){
                     return nums[i];
                 }
                 swap(nums,i,nums[i]);
            }
        }
        return 0;
    }

    public static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}
