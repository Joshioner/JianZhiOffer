package com.example.davie.leetCode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
         if (s == null || s.length() == 0){
             return 0;
         }
         int maxLen = Integer.MIN_VALUE;
         int[] dp =  new int[s.length()];
         dp[0] = 1;
        Map<Character,Integer> char2Index = new HashMap<>();
        for (int index = 0;index <s.length();index++){
            if (index == 0){
                dp[index] =1;
            }else{
                //未访问过
                if (!char2Index.containsKey(s.charAt(index))|| index - char2Index.get(s.charAt(index)) > dp[index - 1]){
                    dp[index] = dp[index - 1] + 1;
                }else{
                    dp[index] = index - char2Index.get(s.charAt(index));
                }
            }
            maxLen = Math.max(maxLen,dp[index]);
            char2Index.put(s.charAt(index),index);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
