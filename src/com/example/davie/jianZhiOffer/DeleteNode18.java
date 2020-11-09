package com.example.davie.jianZhiOffer;

public class DeleteNode18 {
    public ListNode deleteNode(ListNode head, int val) {
          if (head == null){
              return head;
          }
          if (head.val == val){
              return head.next;
          }
          ListNode tmpNode = head;

          while (tmpNode != null){
              if (tmpNode.next != null && tmpNode.next.val == val){
                  ListNode nextNode = tmpNode.next.next;
                  tmpNode.next = nextNode;
                  break;
              }
              tmpNode = tmpNode.next;
          }
          return head;
    }
}
