package com.example.davie.leetCode;

public class ReverseKGroup_25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
          if (head == null || k <= 0){
              return head;
          }
          ListNode tmpNode = head;
          for (int i = 0;i < k ;i++){
              if (tmpNode == null){
                  return head;
              }
              tmpNode = tmpNode.next;
          }
          tmpNode = reverseKGroup(tmpNode,k);
          while (head != null && k > 0){
              ListNode nextNode = head.next;
              head.next = tmpNode;
              tmpNode = head;
              head = nextNode;
              k--;
          }
          return tmpNode;
    }

    public static void main(String[] args) {
        ListNode l6 = new ListNode(6);
        l6.next = null;
        ListNode l5 = new ListNode(5);
        l5.next = l6;
        ListNode l4 = new ListNode(4);
        l4.next = l5;
        ListNode l3 = new ListNode(3);
        l3.next = l4;
        ListNode l2 = new ListNode(2);
        l2.next = l3;
        ListNode l1 = new ListNode(1);
        l1.next = l2;
        ListNode tmp = reverseKGroup(l1,2);
        System.out.println(tmp);

    }
}
