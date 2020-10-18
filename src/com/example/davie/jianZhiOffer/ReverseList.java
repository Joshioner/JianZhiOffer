package com.example.davie.jianZhiOffer;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode nextNode = cur.next;

            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }
}
