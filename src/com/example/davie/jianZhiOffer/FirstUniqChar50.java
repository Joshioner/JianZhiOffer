package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar50 {
    public char firstUniqChar(String s) {
      if (s.trim().length() == 0){
          return ' ';
      }
        Map<Character,Integer> map = new HashMap<>();
      for (Character character:s.toCharArray()){
          map.put(character,map.getOrDefault(character,0) + 1);
      }
      for (Character character:s.toCharArray()){
          if (map.get(character) == 1){
              return character;
          }
      }
      return ' ';
    }
}
