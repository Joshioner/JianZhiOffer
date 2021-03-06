package com.example.davie.jianZhiOffer;

public class FindNumberIn2DArray04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
       if (matrix.length<= 0 || matrix[0].length <= 0){
           return false;
       }
       int row = 0;
       int column = matrix[0].length - 1;
       while (row < matrix.length && column >= 0){
           if (matrix[row][column] == target){
               return true;
           }else if (matrix[row][column] > target){
               column--;
           }else {
               row++;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,5,4,3,2};
        int res = 0;
        for (int n:num){
            res ^= n;
        }
        System.out.println(res);
    }
}
