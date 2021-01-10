package com.example.davie.toutiao;


import com.example.davie.ListNode;

public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode tmpNode = null;
        while (head != null){
            ListNode nextNode = head.next;
            head.next = tmpNode;
            tmpNode = head;
            head = nextNode;
        }
        return tmpNode;
    }
}
