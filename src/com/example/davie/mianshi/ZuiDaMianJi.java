package com.example.davie.mianshi;

public class ZuiDaMianJi {
    public static void main(String[] args) {
        int[] heights ={1,2,10,9,8,7,7,7};
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        for (int i = 1;i < heights.length;i++){
            int tmpIndex = i - 1;
            while (tmpIndex >= 0 && heights[tmpIndex] >= heights[i]){
                tmpIndex--;
            }
            left[i] = tmpIndex + 1;
            tmpIndex = i + 1;
            while (tmpIndex < heights.length && heights[tmpIndex] >= heights[i]){
                tmpIndex++;
            }
            right[i] = tmpIndex - 1;
        }
        int maxArea = 0;
        for (int i = 1;i < heights.length;i++){
            int tmpArea = (right[i] - left[i]) * heights[i];
            maxArea = Math.max(tmpArea,maxArea);
        }
        System.out.println(maxArea);
    }
}
