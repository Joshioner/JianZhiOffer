package com.example.davie.leetCode;

public class ReverseSentence {
    public static String ReverseSentence(String str) {
        if (str == null || str.length() <= 0 || str.trim().length() <= 0){
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("123456"));
    }
}
