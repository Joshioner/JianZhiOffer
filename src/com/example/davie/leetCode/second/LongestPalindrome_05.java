package com.example.davie.leetCode.second;

public class LongestPalindrome_05 {
    public String longestPalindrome(String s) {
        if (s == null || s.trim().length() < 2){
            return s;
        }
        int start = 0;
        int maxLen = 1;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length();i++){
            dp[i][i] = true;
        }
       for (int j = 1;j < s.length();j++){
           for (int i = 0; i < j;i++){
               if (s.charAt(i) != s.charAt(j)){
                   dp[i][j] = false;
               }else{
                   if (j - i + 1 < 4){
                       dp[i][j] = true;
                   }else {
                       dp[i][j] = dp[i+ 1][j-1];
                   }
               }
               if (dp[i][j] && j -i + 1 > maxLen){
                   start = i;
                   maxLen = j - i + 1;
               }
           }
       }
       return s.substring(start,start + maxLen);
    }

    public static void main(String[] args) {
        String name = "davie";
        System.out.println(name.substring(0,3));
    }
}
