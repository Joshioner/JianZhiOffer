package com.example.davie.jianZhiOffer;

public class MaxDepth55 {
    public int maxDepth(TreeNode root) {
       if (root == null){
           return 0;
       }
       return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

      class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
