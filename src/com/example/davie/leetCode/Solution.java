package com.example.davie.leetCode;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
      stack1.push(node);
      if (stack2.isEmpty() || stack2.peek() >= node){
          stack2.push(node);
      }
    }

    public void pop() throws Exception {
        if (stack1.isEmpty()){
            throw new Exception("stack is empty!");
        }
      int num = stack1.peek();
      if (!stack2.isEmpty() && stack2.peek() == num){
          stack2.pop();
      }
      stack1.pop();
    }

    public int top() {
      return stack1.peek();
    }

    public int min() throws Exception {
        if (stack1.isEmpty()){
            throw new Exception("stack is empty!");
        }
        return stack2.peek();
    }
}
