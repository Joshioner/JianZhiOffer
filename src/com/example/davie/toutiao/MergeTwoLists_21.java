package com.example.davie.toutiao;

import com.example.davie.ListNode;

public class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null){
                return l2;
            }
            if (l2 == null){
                return l1;
            }
            ListNode headNode = null;
            if (l1.val < l2.val){
                headNode = new ListNode(l1.val);
                headNode.next = mergeTwoLists(l1.next,l2);
            }else {
                headNode = new ListNode(l2.val);
                headNode.next = mergeTwoLists(l1,l2.next);
            }
            return headNode;
    }
}
