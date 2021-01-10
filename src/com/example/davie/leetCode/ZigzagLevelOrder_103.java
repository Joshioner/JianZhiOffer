package com.example.davie.leetCode;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZigzagLevelOrder_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          if (root == null){
              return new ArrayList<>();
          }
          List<List<Integer>> res = new ArrayList<>();

          Queue<TreeNode> queue = new LinkedBlockingQueue<>();
          queue.add(root);
          boolean flag = true;
          while (!queue.isEmpty()){
             int size = queue.size();
             List<Integer> list = new ArrayList<>();
             for (int i = 0;i < size;i++){
                 TreeNode node = queue.poll();
                 if (node.left != null){
                     queue.add(node.left);
                 }
                 if (node.right != null){
                     queue.add(node.right);
                 }
                 list.add(node.val);
             }
             if (!flag){
                 int left = 0;
                 int right = list.size() - 1;
                 while (left < right){
                     int tmp = list.get(right);
                     list.set(right,list.get(left));
                     list.set(left,tmp);
                     left++;
                     right--;
                 }
             }
             flag = !flag;
             res.add(list);
          }
          return res;
    }
}
