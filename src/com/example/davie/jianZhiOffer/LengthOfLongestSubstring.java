package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       if (s ==null || s.length() <= 0){
           return 0;
       }
       int[] res = new int[s.length()];
        Map<Character,Integer> char2Index = new HashMap<>();
       int index = 0;
       int maxLen = 1;
        res[0] =1;
        char2Index.put(s.charAt(index),index);
        for (index = 1; index < s.length();index++){
            if (!char2Index.containsKey(s.charAt(index)) || index - char2Index.get(s.charAt(index))> res[index - 1]){
                res[index] = res[index - 1]+1;
            }else{
                res[index] = index - char2Index.get(s.charAt(index));
            }
            maxLen =Math.max(res[index],maxLen);
            char2Index.put(s.charAt(index),index);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "eeydgwdykpv";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
