package com.example.davie.leetCode;

public class Power {
    public double Power(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        boolean flag = true;
        if (exponent < 0){
            flag = false;
            exponent = -exponent;
        }
        double res = pow(base,exponent);
        return flag ? res :1/res;
    }

    public double pow(double base,int exponent){
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
       double res = pow(base,exponent / 2);
        res = res * res;
        if (exponent % 2 == 1){
            res = base * res;
        }
        return res;

    }
}
