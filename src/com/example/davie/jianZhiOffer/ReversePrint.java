package com.example.davie.jianZhiOffer;

import java.util.Stack;

/**
 * 面试题06：从头到尾打印链表
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class ReversePrint {
    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head){
      if (head == null ){
          return new int[]{};
      }
      Stack<Integer> stack = new Stack<>();
      while (head!=null){
          stack.push(head.val);
          head = head.next;
      }
      int[] res = new int[stack.size()];
      for (int i = 0;i < res.length;i++){
          res[i] = stack.pop().intValue();
      }
      return res;
    }
}
