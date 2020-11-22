package com.example.davie.jianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class PathSum34 {
    private static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
      backtracking(root,sum,new ArrayList<>());
      return res;
    }

    public static void backtracking(TreeNode root,int target,List<Integer> path){
         if (root == null)
             return;
         path.add(root.val);
         target -= root.val;
         if (target == 0 && root.left == null && root.right == null){
             res.add(new ArrayList<>(path));
         }else{
             backtracking(root.left,target,path);
             backtracking(root.right,target,path);
         }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode leftNode = new TreeNode(4);
        TreeNode right = new TreeNode(20);
        TreeNode root = new TreeNode(15);
        root.left = leftNode;
        root.right = right;
        pathSum(root,19);
        System.out.println(res);
    }
}
