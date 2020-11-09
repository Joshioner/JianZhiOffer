package com.example.davie.jianZhiOffer;

public class IsSymmetric28 {
    public boolean isSymmetric(TreeNode root) {
         return root == null || isMatch(root.left, root.right);
    }

    public boolean isMatch(TreeNode left,TreeNode right){
        //终止条件
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val != right.val)
            return false;
        return isMatch(left.left,right.right) && isMatch(left.right,right.left);
    }
}
