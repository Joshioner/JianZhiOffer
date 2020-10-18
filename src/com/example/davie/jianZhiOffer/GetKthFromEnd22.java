package com.example.davie.jianZhiOffer;

import java.util.Stack;

public class GetKthFromEnd22 {
    //另外解决方案：设置两个指针，第一个指针先走k步，然后两个指针在同时走
    // 当第一个指针指向尾部的时候，第二个指针指向的则是倒数第K个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        if (k > stack.size()){
            return null;
        }
        ListNode result = null;
        while (k > 0){
            result = stack.pop();
            k--;
        }
        return result;
    }


}
