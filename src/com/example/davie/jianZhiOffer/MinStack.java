package com.example.davie.jianZhiOffer;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;
    public MinStack() {
      stackA = new Stack<>();
      stackB = new Stack<>();
    }

    public void push(int x) {
       stackA.push(x);
       if (stackB.isEmpty() || stackB.peek() >= x){
           stackB.push(x);
       }
    }

    public void pop() {
       Integer num = stackA.pop();
       if (num != null && !stackB.isEmpty()  && stackB.peek().intValue() == num.intValue()){
           stackB.pop();
       }
    }

    public int top() {
       return stackA.peek();
    }

    public int min() {
       return stackB.isEmpty() ? 0 : stackB.peek();
    }
}
