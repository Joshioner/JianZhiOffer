package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement39 {
    public int majorityElement(int[] nums) {
      if (nums.length == 0){
          return 0;
      }
        Map<Integer,Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num,counts.getOrDefault(num,0) + 1);
            if (counts.get(num) >= (nums.length + 1) / 2){
                return num;
            }
        }
        return 0;
    }
}
