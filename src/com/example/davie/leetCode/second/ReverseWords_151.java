package com.example.davie.leetCode.second;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords_151 {
    public String reverseWords(String s) {
        if (s == null || s.trim().length() <= 0){
            return s;
        }
        String[] split = s.trim().split(" +");
        int left = 0;
        int right = split.length - 1;
        while (left < right){
            String tmp = split[left];
            split[left] = split[right];
            split[right] = tmp;
            right--;
            left++;
        }
        return String.join(" ", split);
    }


    public static void main(String[] args) {
        String[] res = {"adsas","asdasd","sfdcsadfas"};
        System.out.println(String.join(" ",res));
    }
}
