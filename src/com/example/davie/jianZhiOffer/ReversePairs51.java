package com.example.davie.jianZhiOffer;

import java.util.Arrays;

public class ReversePairs51 {
    public  int reversePairs(int[] nums) {
         if(nums.length <= 1){
             return 0;
         }
       return sort(nums,0,nums.length - 1);
    }

    public int sort(int[] num,int left,int right){
        if (left >= right)
            return 0;
        int mid = left + (right - left) / 2;
       return sort(num,left,mid) + sort(num,mid + 1,right) + merge(num,left,mid,right);
    }
    public  int merge(int[] num,int left,int mid,int right){
        int[] temp = new int[right - left + 1];
        int count = 0;
        int k = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right){
            if (num[i] <= num[j]){
                temp[k++] = num[i++];
            }else{
                temp[k++] = num[j++];
                //从i后面的数，都比num[j]大
                count += mid - i + 1;
            }
        }
        while (i <= mid){
            temp[k++] = num[i++];
            //从这个数开始，都大于后面的数组，后面数组的个数为 j - (mid + 1)，因为j先j++
           // count += j - (mid + 1);
        }
        while (j <= right){
            temp[k++] = num[j++];
        }
        for (int m = 0;m < k;m++){
            num[m + left] = temp[m];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,46,67,89,12,34};
     //   System.out.println(reversePairs(nums));
//        System.out.println("排序前：" + Arrays.toString(nums));
//        sort(nums,0,nums.length - 1);
//        System.out.println("排序后：" + Arrays.toString(nums));

    }
}
