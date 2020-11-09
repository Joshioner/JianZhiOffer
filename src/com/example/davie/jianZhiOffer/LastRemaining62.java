package com.example.davie.jianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class LastRemaining62 {
//    public int lastRemaining(int n, int m) {
//
//    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
        System.out.println(list.indexOf(8));
        list.remove(8);
        System.out.println(list.indexOf(8));
        System.out.println(list.size());
    }
}
