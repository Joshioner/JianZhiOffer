package com.example.davie.leetCode;

import java.util.ArrayList;

public class FindContinuousSequence {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int currentSum = 0;
        int mid = (sum / 2 ) + 1;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 1;i < mid;i++){
            currentSum  = i;
            for (int j = i + 1; j <= mid;j++){
                currentSum  += j;
                if (currentSum == sum){
                    lists.add(add(i,j));
                    break;
                }else if (currentSum > sum){
                    break;
                }
            }
            currentSum = 0;
        }
        return lists;
    }

    public static ArrayList<Integer> add(int small,int big){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = small;i<= big;i++){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(3));
    }
}
