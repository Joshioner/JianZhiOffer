package com.example.davie.leetCode;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0){
            return null;
        }
        ListNode preNode = head,nextNode =head;
        for (int  i = 0; i< k;i++){
            if (nextNode == null){
                return null;
            }
            nextNode = nextNode.next;
        }
        while (nextNode != null){
            preNode = preNode.next;
            nextNode = nextNode.next;
        }
        return preNode;
    }
}
