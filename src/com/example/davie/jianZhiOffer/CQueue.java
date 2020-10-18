package com.example.davie.jianZhiOffer;

import java.util.Stack;

/**
 * 队列1：当有数据进队列的时候，则直接进队列1
 * 队列2：当有数据出队列的时候，则先判断两个队列是否为空，为空的话，则直接返回；
 * 不为空的话，则判断队列2是否为空，不为空，则直接返回队列2的顶部数据；
 * 为空，则将队列1中的数据循环放进队列2，然后返回队列2的顶部数据
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.size() == 0 && stack2.size() == 0){
            return -1;
        }
        if (stack2.size() != 0)
            return stack2.pop();
        while (stack1.size() != 0){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
