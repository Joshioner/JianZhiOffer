package com.example.davie.jianZhiOffer;

public class MirrorTree27 {
    public TreeNode mirrorTree(TreeNode root) {
      if (root == null)
          return null;
      TreeNode leftNode = root.left;
      TreeNode rightNode = root.right;
      root.left = mirrorTree(rightNode);
      root.right = mirrorTree(leftNode);
      return root;
    }
}
