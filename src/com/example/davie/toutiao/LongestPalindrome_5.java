package com.example.davie.toutiao;

public class LongestPalindrome_5 {
    //    public String longestPalindrome(String s) {
//      if (s == null || s.trim().length() == 0){
//          return s;
//      }
//      int start = 0;
//      int right = 0;
//      for (int i = 0; i < s.length();i++){
//          int len1 = longestPalindrome(s,i,i);
//          int len2 = longestPalindrome(s,i,i+ 1);
//          int len = Math.max(len1,len2);
//          if (len > right - start){
//              start = i - (len - 1)/2;
//              right = i + len /2;
//          }
//      }
//      return s.substring(start,right + 1);
//    }
//
//    public int longestPalindrome(String s,int left,int right){
//        while (left >= 0  && right < s.length() && s.charAt(left) == s.charAt(right)){
//            left--;
//            right++;
//        }
//        return right - left - 1;
//    }
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
                }else {
                    if (j - i + 1 < 4){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen){
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start,start + maxLen);
    }

}
