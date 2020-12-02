package com.example.davie.jianZhiOffer;

public class Fib10_1 {
    public int fib(int n) {
//        if (n == 0)
//            return 0;
//        if(n == 1)
//            return 1;
//        int[] dp =  new int[n+ 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2;i <= n;i++){
//            dp[i] = dp[i - 1] + dp[i - 2];
//            dp[i] = dp[i] % 1000000007;
//        }
//        return dp[n];
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int pre1 = 0,pre2 = 1;
        int temp = 0;
        for (int i = 2; i <= n;i++){
            temp = pre1 + pre2;
            temp = temp % 1000000007;
            pre1 = pre2;
            pre2 = temp;
        }
        return temp;
    }
}
