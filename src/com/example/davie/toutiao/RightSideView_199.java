package com.example.davie.toutiao;


import com.example.davie.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class RightSideView_199 {
//    public List<Integer> rightSideView(TreeNode root) {
//        if (root == null){
//            return new ArrayList<>();
//        }
//        List<Integer> list = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for (int i = 0; i <size;i++){
//                TreeNode node = queue.poll();
//                if (node.left !=null){
//                    queue.add(node.left);
//                }
//                if (node.right != null){
//                    queue.add(node.right);
//                }
//                if (i == size - 1){
//                    list.add(node.val);
//                }
//            }
//        }
//        return list;
//    }
       List<Integer> list = new ArrayList<>();
        public List<Integer> rightSideView(TreeNode root) {
              depth(root,0);
              return list;
        }
        public void depth(TreeNode node,int depth){
            if (node == null){
                return;
            }
            if (depth == list.size()){
                list.add(node.val);
            }
            depth++;
            depth(node.right,depth);
            depth(node.left,depth);
        }


}
