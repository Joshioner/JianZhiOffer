package com.example.davie.jianZhiOffer;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class LevelOrder32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null){
          return new int[0];
        }
        List<Integer> nums= new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            nums.add(node.val);

            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right !=null){
                queue.add(node.right);
            }
        }
        int[] res = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            res[i] = nums.get(i);
          }
        return  res;

    }

    public static void main(String[] args) {
        int num = 10 ^ 5 ^ 10;
        System.out.println(num);
    }
}
