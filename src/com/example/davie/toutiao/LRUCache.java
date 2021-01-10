package com.example.davie.toutiao;

import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int value;
    Node pre;
    Node next;
    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
    public Node(){}
}

public class LRUCache {

    Map<Integer,Node> cache ;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        if (capacity < 1){
            throw new RuntimeException("capacity must excess 1");
        }
       this.capacity =capacity;
       cache = new HashMap<>();
       head = new Node();
       tail = new Node();
       head.next = tail;
       tail.pre = head;
    }

    public int get(int key) {
      Node node = cache.get(key);
      //找不到节点
      if (node == null){
          return -1;
      }
      //移除对应的节点
        removeNode(node);
        //将节点移至头部位置
        addToHead(node);
        return node.value;
    }
    public void put(int key, int value) {
      Node node = cache.get(key);
      //节点不存在，则新建节点，移至头部
      if (node == null){
          node = new Node(key,value);
          addToHead(node);
          cache.put(key,node);
          //超过最大容量，则移除尾部节点
          if (cache.size() > capacity){
             Node removeNode = removeTail();
             cache.remove(removeNode.key);
          }
      }else{
          //节点已存在，则移至头部
          node.value = value;
          removeNode(node);
          addToHead(node);
      }
    }
    public void removeNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    public void addToHead(Node node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    public Node removeTail(){
        Node node = tail.pre;
        removeNode(node);
        return node;
    }


}
