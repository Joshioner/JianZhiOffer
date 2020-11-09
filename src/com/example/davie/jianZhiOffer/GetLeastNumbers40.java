package com.example.davie.jianZhiOffer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0){
            return new int[]{};
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0;i < k;i++){
            queue.offer(arr[i]);
        }
        for (int i = k;i < arr.length ;i++){
            if (queue.peek() > arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int[] res = new int[k];
        for (int i = 0;i < k;i++){
            res[i] = queue.poll();
        }
        return res;


    }
}
