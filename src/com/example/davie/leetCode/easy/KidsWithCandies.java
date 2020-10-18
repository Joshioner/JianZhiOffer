package com.example.davie.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0 ){
            return new ArrayList<>();
        }
//       //找出最大值
//        int maxNum = Arrays.stream(candies).max().getAsInt();
//        //当前数 + 额外分配的糖果 判断是否大于最大数
//        List<Boolean> list = Arrays.stream(candies).mapToObj(i -> i + extraCandies >= maxNum ? true:false).collect(Collectors.toList());
//        return list;
        int maxCandies = 0;
        for (int i = 0; i < candies.length; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;

    }
}
