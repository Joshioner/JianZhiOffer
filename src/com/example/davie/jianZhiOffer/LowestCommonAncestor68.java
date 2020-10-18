package com.example.davie.jianZhiOffer;

public class LowestCommonAncestor68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || p == root || q == root){
           return root;
       }
       //判断该节点的左右子树是否包含要p、q节点
       TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
       TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
       //如果p、q分别落在该根节点的左右子树上，则该节点为最近公共祖先节点
       if (leftNode != null && rightNode != null){
           return root;
       }
       return  leftNode == null ? rightNode : leftNode;
    }
}
