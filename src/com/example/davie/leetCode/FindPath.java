package com.example.davie.leetCode;

import java.util.ArrayList;

public class FindPath {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
         if (root == null){
             return ret;
         }
        backtracking(root,target,new ArrayList<Integer>());
         return ret;
    }
    public void backtracking(TreeNode root,int target,ArrayList<Integer> path){
        if (root == null){
            return;
        }
        target -= root.val;
        path.add(root.val);
        if (target == 0 && root.left == null && root.right == null){
            ret.add(new ArrayList<>(path));
        }else{
            backtracking(root.left,target,path);
            backtracking(root.right,target,path);
        }
        path.remove(path.size() - 1);
        return;
    }
}
