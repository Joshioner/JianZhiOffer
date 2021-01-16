package com.example.davie.leetCode.second;

import com.example.davie.ListNode;

public class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
           if (l1 == null){
                 return l2;
             }
             if (l2 == null){
                 return l1;
             }
             ListNode headNode = new ListNode(-1);
             ListNode tmpNode = headNode;
             while (l1 != null && l2 != null){
                 if (l1.val < l2.val){
                     tmpNode.next = l1;
                     tmpNode = tmpNode.next;
                     l1 = l1.next;
                 }else {
                     tmpNode.next = l2;
                     tmpNode = tmpNode.next;
                     l2 = l2.next;
                 }
             }
             while (l1 != null){
                 tmpNode.next = l1;
                 tmpNode = tmpNode.next;
                 l1 = l1.next;
             }
             while (l2 != null){
                 tmpNode.next = l2;
                 tmpNode = tmpNode.next;
                 l2 = l2.next;
             }
             return headNode.next;
     }
}
