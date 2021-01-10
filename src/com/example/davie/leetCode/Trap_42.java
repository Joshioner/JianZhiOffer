package com.example.davie.leetCode;

public class Trap_42 {
    public int trap(int[] height) {
       if (height == null || height.length <= 0){
           return 0;
       }
       int[] leftMax = new int[height.length];
       int[] rightMax = new int[height.length];
       leftMax[0] = height[0];
       for (int i = 1; i < height.length;i++){
           leftMax[i] = Math.max(height[i],leftMax[i - 1]);
       }
       rightMax[height.length - 1] = height[height.length - 1];
       for (int i = height.length - 2;i >= 0;i--){
           rightMax[i] = Math.max(height[i],rightMax[i + 1]);
       }
       int total = 0;
       for (int i = 0;i < height.length;i++){
           total += Math.min(leftMax[i],rightMax[i]) - height[i];
       }
       return total;
    }
}
