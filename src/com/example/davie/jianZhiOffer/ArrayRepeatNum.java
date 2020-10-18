package com.example.davie.jianZhiOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题3：数组中重复的数字
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 */
public class ArrayRepeatNum {

    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }

    /**
     * 思路：
     * （1）判空操作 或者 特殊情况的数组判断(nums == null || nums.length <= 1)
     *    满足该情况则直接返回 -1
     * （2）初始化一个空set集合
     *  (3)遍历数组中的每个元素
     *    - 如果该元素已经存在集合中，则直接返回该重复元素
     *    - 如果元素不存在，则添加至集合中
     *
     *  时间复杂度：O(n)
     *  空间复杂度：0(n)
     *  暴力解法：
     *     双重遍历数组，直至找到重复元素
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length <= 1){
            return -1;
        }
        Set<Integer> numberSet = new HashSet<>();
         for (Integer num:nums){
             if (numberSet.contains(num)){
                 return num;
             }
             numberSet.add(num);
         }
         return -1;
    }
}
