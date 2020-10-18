package com.example.davie.jianZhiOffer;

public class KthLargest {
    //中序遍历，不是采取 【左、中、右】 而是采取了【右、中、左】 这样的话 遍历到第K个就是在数组中第K大的数字了
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if (root == null)
            return ;
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0 )res = root.val;
        dfs(root.left);
    }
}
