package com.example.davie.jianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class BuildTree07 {
    private static Map<Integer,Integer> indexMap= new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length){
            return null;
        }
        for (int i = 0 ;i < inorder.length;i++){
            indexMap.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length - 1,0,inorder.length - 1);
    }

    public static TreeNode buildTree(int[] preOrder,int preLeft,int preRight,int inLeft,int inRight){
        if (preLeft > preRight || inLeft > inRight){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preLeft]);
        int index= indexMap.get(root.val);
        root.left = buildTree(preOrder,preLeft + 1,preLeft + index - inLeft,inLeft,index - 1);
        root.right = buildTree(preOrder,preLeft + index - inLeft + 1,preRight,index + 1,inRight);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(buildTree(new int[]{1,2,3},new int[]{3,2,1}));
    }
}
