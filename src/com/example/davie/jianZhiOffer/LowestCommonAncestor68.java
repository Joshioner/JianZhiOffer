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
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length <= 0){
            return false;
        }
        return isSquenceOfBST(sequence,0,sequence.length - 1);
    }
    private boolean isSquenceOfBST(int[] sequence,int left,int right){
        if (right <= left){
            return true;
        }
        int currentIdx = left;
        int root = sequence[right];
        for (currentIdx = left;currentIdx < right;currentIdx++){
            if (sequence[currentIdx] >= root)
                break;
        }
        for (int i = currentIdx;i < right - 1;i++){
            if (sequence[i] < root){
                return false;
            }
        }
        return isSquenceOfBST(sequence,left,currentIdx - 1) && isSquenceOfBST(sequence,currentIdx,right - 1);
    }
}
