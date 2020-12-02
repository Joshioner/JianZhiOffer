package com.example.davie.leetCode;





import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         if (listNode == null ){
             return new ArrayList<>();
         }
         ListNode node = null;
         while (listNode != null){
             ListNode next = listNode.next;
             listNode.next = node;
             node = listNode;
             listNode = next;
         }
         ArrayList<Integer> list = new ArrayList<>();
         while (node != null){
             list.add(node.val);
             node = node.next;
         }
         return list;
    }
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode node = null;
        while (head != null){
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }
}
