package com.example.davie.leetCode;

public class IsBalanced {
    boolean isBlance = true;
    public boolean IsBalanced_Solution(TreeNode root) {
         if (root == null){
             return true;
         }
         getDepth(root);
         return isBlance;
    }
    public int getDepth(TreeNode root){
        if (root == null || !isBlance){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1){
            isBlance = false;
        }
        return Math.max(left,right) + 1;
    }
}
