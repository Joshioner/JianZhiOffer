package com.example.davie.jianZhiOffer;

/**
 * 剑指 Offer 15. 二进制中1的个数
 */
public class HammingWeight15 {
    public int hammingWeight(int n) {
//        int res = 0;
//        while (n != 0){
//            res += n & 1;
//            n >>>= 1;
//        }
//        return res;
        int res = 0;
        while (n != 0){
            res++;
            n &= (n-1);
        }
        return res;
    }
//    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(10));
//    }
}
