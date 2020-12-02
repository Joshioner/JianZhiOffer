package com.example.davie.leetCode;

public class GetMost {
    public int getMost(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0){
            return 0;
        }
        //状态方程：s[i][j] = board[i][j] + Math.max(s[i-1][j],s[i][j-1])
        //初始化第一行，第一列
        int[][]  s = new int[board.length][board[0].length];
        s[0][0] = board[0][0];
        for (int i = 1;i < board.length;i++){
            s[0][i] = s[0][i - 1] + board[0][i];
        }
        for (int i = 1;i < board[0].length;i++){
            s[i][0] = s[i - 1][0] + board[i][0];
        }
        for (int i = 1;i < board.length;i++){
            for (int j = 1;j < board[0].length;j++){
                s[i][j] = board[i][j] + Math.max(s[i - 1][j],s[i][j-1]);
            }
        }
        return s[board.length - 1][board[0].length - 1];
    }
}
