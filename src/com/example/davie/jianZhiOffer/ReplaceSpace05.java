package com.example.davie.jianZhiOffer;

public class ReplaceSpace05 {
    public String replaceSpace(String s) {
      if (s == null || s.length() == 0)
          return s;
      return s.replace(" ","%20");
    }
}
