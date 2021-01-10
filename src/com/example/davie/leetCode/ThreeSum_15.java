package com.example.davie.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0;i < nums.length;i++){
            if (nums[i] > 0) break;  //大于0，则直接跳出
            if (i >  0 && nums[i] == nums[i - 1]) continue;  //去重
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;  //去重
                    while (left < right && nums[right] == nums[right - 1]) right--;  //去重
                    left++;
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }
}
