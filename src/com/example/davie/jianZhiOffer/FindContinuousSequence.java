package com.example.davie.jianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 */
public class FindContinuousSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(findContinuousSequence(9)));
    }
    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        for (int start = 1;start * 2 <= target;start++){
            int count = 1;
            int tmp = start + 1;
            int total = start ;
            while (total <= target){
                if (total == target){
                    int[] arr = new int[count];
                    for (int i = 0;i < count;i++){
                        arr[i] = i + start;
                    }
                    res.add(arr);
                }
                total += tmp;
                count++;
                tmp++;
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}
