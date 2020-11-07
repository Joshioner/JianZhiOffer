package com.example.davie.jianZhiOffer;

public class SumNums64 {
    public int sumNums(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        n += sumNums(n- 1);
        return n;
    }
}
