package com.example.davie.toutiao;

import com.example.davie.ListNode;

public class GetIntersectionNode_160 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null){
//             return null;
//         }
//         int lengthA = 0;
//         int lengthB = 0;
//         ListNode tmpA =  headA;
//         while (tmpA != null){
//             lengthA++;
//             tmpA = tmpA.next;
//         }
//         ListNode tmpB = headB;
//         while (tmpB != null){
//             lengthB++;
//             tmpB = tmpB.next;
//         }
//         int diff = Math.abs(lengthA - lengthB);
//         if (lengthA > lengthB){
//             while (headA != null && diff > 0){
//                 headA = headA.next;
//                 diff--;
//             }
//         }else {
//             while (headB != null  && diff > 0){
//                 headB = headB.next;
//                 diff--;
//             }
//         }
//         while (headA !=null && headB != null){
//             if (headA == headB){
//                 return headA;
//             }
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return null;
//
//    }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null){
                return null;
            }
            ListNode la =headA;
            ListNode lb = headB;
            while (la != lb){
                la = la == null ? headB: la.next;
                lb = lb == null ? headA:lb.next;
            }
            return la;
        }
}
