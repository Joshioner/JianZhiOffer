package com.example.davie.leetCode;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
       if(array == null || array.length < 2){
           return new ArrayList<>();
       }
       ArrayList<Integer> list = new ArrayList<>();
       int i = 0;
       int j = array.length - 1;
       while (i < j){
           int cur = array[i] + array[j];
           if (cur == sum){
               list.add(array[i]);
               list.add(array[j]);
               break;
           }else if (cur > sum){
               j--;
           }else {
               i++;
           }
       }
       return list;
    }
}
