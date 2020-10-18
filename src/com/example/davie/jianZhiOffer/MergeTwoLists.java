package com.example.davie.jianZhiOffer;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        //遍历
        ListNode tmpNode = new ListNode(0);
        ListNode currentNode = tmpNode;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }else{
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = l1 != null ? l1:l2;
        return tmpNode.next;
        //递归
//        if (l1.val <= l2.val){
//            tmpNode.val = l1.val;
//            tmpNode.next = mergeTwoLists(l1.next,l2);
//        }else{
//            tmpNode.val = l2.val;
//            tmpNode.next = mergeTwoLists(l1,l2.next);
//        }
//       return  tmpNode;
    }
}
