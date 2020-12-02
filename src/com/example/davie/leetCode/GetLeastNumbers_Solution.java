package com.example.davie.leetCode;

import java.util.ArrayList;
import java.util.List;

public class GetLeastNumbers_Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
          if (input == null || input.length <= 0 || k <= 0 || k > input.length){
              return new ArrayList<>();
          }
          int start = 0,right = input.length - 1;
          while (start < right){
              int partition = divide(input,start,right);
              if (partition == k - 1){
                  break;
              }else if(partition > k - 1){
                  right = partition - 1;
              }else {
                  start = partition + 1;
              }
          }
        ArrayList<Integer>  list = new ArrayList<>();
          for (int  i = 0 ;i < k;i++){
              list.add(input[i]);
          }
          return list;
    }

    //找出基准
    public  static int divide(int[] arr,int start,int end){
        //已头部为基准
        int base = arr[start];
        while (start < end){
            while (start < end && arr[end] >= base){
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
        int[] nums = {10,5,9,8,6,5,6,5};
        ArrayList<Integer> integers = GetLeastNumbers_Solution(nums, 5);
        System.out.println(integers);
    }
}
