package com.example.davie.jianZhiOffer;

public class GetIntersectionNode52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int lengthA = 1;
        int lengthB = 1;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while (tmpA != null){
            lengthA++;
            tmpA = tmpA.next;
        }
        while (tmpB != null){
            lengthB++;
            tmpB = tmpB.next;
        }
        if (lengthA > lengthB){
            for (int i = 0;i < lengthA - lengthB;i++){
                headA = headA.next;
            }
        }else{
            for (int i = 0; i < lengthB - lengthA;i++){
                headB = headB.next;
            }
        }
        while (headA != null && headB != null){
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
