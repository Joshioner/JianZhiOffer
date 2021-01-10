package com.example.davie.toutiao;

import java.util.Arrays;

public class ReverseWords_151 {
    public static String reverseWords(String s) {
       if (s == null || s.trim().length() == 0){
           return s;
       }
       String[] spilt = s.trim().split(" +");
       int left = 0;
       int right = spilt.length - 1;
       while (left < right){
           String tmp = spilt[left];
           spilt[left] = spilt[right];
           spilt[right] = tmp;
           left++;
           right--;
       }
       StringBuilder stringBuilder = new StringBuilder();
       for (int i = 0;i < spilt.length;i++){
           stringBuilder.append(spilt[i]);
           if (i != spilt.length - 1){
               stringBuilder.append(" ");
           }
       }
       return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
