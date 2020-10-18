package com.example.davie.jianZhiOffer;

public class ReverseLeftWords58 {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdef",7));
    }
    public static String reverseLeftWords(String s, int n) {
         if (s == null || s.length() == 0)
             return s;
         n = n % s.length();
         StringBuffer sb = new StringBuffer();
         sb.append(s.substring(n)).append(s.substring(0,n));
         return sb.toString();
    }
}
