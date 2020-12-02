package com.example.davie.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        if (num == null || num.length < size || size < 1){
            return new ArrayList<>();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        for (int i = 0;i < size;i++){
            queue.add(num[i]);
        }
        ArrayList<Integer> ret = new ArrayList<>();
        ret.add(queue.peek());
        for (int i = 0,j = i + size;j < num.length;i++,j++){
            queue.remove(num[i]);
            queue.add(num[j]);
            ret.add(queue.peek());
        }
        return ret;

    }
}
