package com.example.davie.toutiao;

import java.util.Stack;

public class IsValid_20 {
    public boolean isValid(String s) {
       if (s == null || s.trim().length() == 0){
           return true;
       }
        Stack<Character> stack = new Stack<>();
       for (Character character:s.toCharArray()){
           if (character == '(' || character == '{' || character == '['){
               stack.push(character);
           }else{
               if (stack.isEmpty()){
                   return false;
               }
               if (character == ')'){
                   if (stack.peek() == '('){
                       stack.pop();
                   }else {
                       return false;
                   }
               }else if (character =='}'){
                   if (stack.peek() == '{'){
                       stack.pop();
                   }else {
                       return false;
                   }
               }else if (character == ']'){
                   if (stack.peek() == '['){
                       stack.pop();
                   }else {
                       return false;
                   }
               }else {
                   return false;
               }
           }
       }
       return stack.isEmpty();
    }
}
