package com.example.davie.jianZhiOffer;

public class Exist12 {
    public static boolean exist(char[][] board, String word) {
          if (word == null || word.length() <= 0){
              return false;
          }
          for (int i = 0;i < board.length;i++){
              for (int j = 0;j < board[0].length;j++){
                  if (exist(i,j,board,word,0)) return true;
              }
          }
          return false;
    }

    public static boolean exist(int row,int column,char[][] board,String word,int index){
        if (index >= word.length()){
            return true;
        }
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length ||  board[row][column] != word.charAt(index) ){
            return false;
        }
        char tmp = word.charAt(index);
        board[row][column] = '/';
        boolean res = exist(row - 1,column,board,word,index+1) || exist(row,column - 1,board,word,index+1)||
                        exist(row,column + 1,board,word,index+1) || exist(row + 1 ,column,board,word,index+1);
        board[row][column] = tmp;
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));
        System.out.println(board[0][0]);
        System.out.println(word.charAt(0));
    }
}
