package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber03 {
    public int findRepeatNumber(int[] nums) {
        if (nums.length <= 0){
            return 0;
        }
        Map<Integer,Integer> num2CountMap = new HashMap<>();
        for (int num : nums) {
          num2CountMap.put(num,num2CountMap.getOrDefault(num,0) + 1);
          if (num2CountMap.get(num) >= 2){
              return num;
          }
        }
        return 0;
    }
}
