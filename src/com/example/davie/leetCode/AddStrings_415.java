package com.example.davie.leetCode;

public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
       StringBuilder stringBuilder = new StringBuilder("");
       int i = num1.length() - 1,j = num2.length() - 1;
       int carry = 0;
       while (i >= 0 || j >= 0){
           int n1 = i >= 0 ? num1.charAt(i) - '0':0;
           int n2 = j >= 0 ? num2.charAt(j) - '0':0;
           int tmp = n1 + n2 + carry;
           stringBuilder.append(tmp % 10);
           carry = tmp/10;
           i--;
           j--;
       }
       if (carry == 1)
           stringBuilder.append(1);
       return stringBuilder.reverse().toString();
    }
}
