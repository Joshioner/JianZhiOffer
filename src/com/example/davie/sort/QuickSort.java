package com.example.davie.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr,int start,int end){
        if (start < end){
            int partition = divide(arr,start,end);
            sort(arr,start,partition - 1);
            sort(arr,partition + 1,end);
        }
    }

    //找出分界点
    public static int divide(int[] arr,int start,int end){
        //已头部为基准
        int base = arr[start];
        while (start < end){
            while (start < end && arr[end] > base){
                end--;
            }
            //不用判断start<end,大不了 start == end，原地交换
            arr[start] = arr[end];
            while (start < end && arr[start] < base){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[end] = base;
        return end;
    }

    public static void main(String[] args) {
        int[] nums = {3,8,6,7,10,4,5,9};
        sort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
