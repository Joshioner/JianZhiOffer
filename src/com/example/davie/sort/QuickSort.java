package com.example.davie.sort;

import java.util.Arrays;

/**
 * 快速排序算法(不是稳定算法)
 * 时间复杂度：O(N logN),最好时间复杂度O(N logN) ---> 已经排好序,最坏时间复杂度O(N^2)--->逆序
 * 空间复杂度：O(1)
 *
 */
public class QuickSort {
    public static void sort(int[] arr,int start,int end){
        if (start < end){
            int partition = divide(arr,start,end);
            sort(arr,start,partition - 1);
            sort(arr,partition + 1,end);
        }
    }

    public static int divide(int[] nums,int left,int right){
        //已头部为基准，或者可以随机找个为基准
        int base = nums[left];
        while (left < right){
            while (left < right && nums[right] > base){
                right--;
            }
            if (left < right){
                nums[left] = nums[right];
            }
            while (left < right && nums[left] <= base){
                left++;
            }
            if (left < right){
                nums[right] = nums[left];
            }
        }
        nums[left] = base;
        return left;
    }
//    //找出分界点
//    public static int divide(int[] arr,int start,int end){
//        //已头部为基准
//        int base = arr[start];
//        while (start < end){
//            while (start < end && arr[end] > base){
//                end--;
//            }
//            //不用判断start<end,大不了 start == end，原地交换
//            arr[start] = arr[end];
//            while (start < end && arr[start] < base){
//                start++;
//            }
//            arr[end] = arr[start];
//        }
//        arr[end] = base;
//        return end;
//    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,8,6,7,10,4,5,9,5,5};
        sort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
