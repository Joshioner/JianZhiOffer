package com.example.davie.jianZhiOffer;

public class PrintNumbers17 {
    public int[] printNumbers(int n) {
       int num = 9;
       int total = 0;
       for (int i = 0;i < n;i++){
          total = total + num;
          num =  num * 10;
       }
       int[] arr = new int[total];
       for (int i = 1;i<= total;i++){
           arr[i-1] = i;
       }
       return arr;
    }
}
