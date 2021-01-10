package com.example.davie.leetCode;

import java.util.ArrayList;

public class KthNode {
    TreeNode result = null;
    int cnt = 0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot == null || k == 0)
            return null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        midBianLi(pRoot,k);

        return result;
    }
    public void midBianLi(TreeNode root,int k){
        if (root == null || cnt > k){
            return;
        }
        midBianLi(root.left,k);
        cnt++;
        if (cnt == k){
            result = root;
        }
        midBianLi(root.right,k);
    }
}
