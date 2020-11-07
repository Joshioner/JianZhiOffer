package com.example.davie.jianZhiOffer;



public class IsSubStructure26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
       if (B== null || A == null){
           return false;
       }
       return recre(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean recre(TreeNode parentNode,TreeNode childNode){
        if (childNode == null)
            return true;
        if (parentNode == null || parentNode.val != childNode.val){
            return false;
        }
        return recre(parentNode.left,childNode.left) && recre(parentNode.right,childNode.right);
    }

}
