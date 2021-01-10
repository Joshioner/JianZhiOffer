package com.example.davie.leetCode;

public class GetNumberOfK {
    public static int getNumberOfK(int [] array , int k) {
        if (array == null || array.length <= 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right){
            mid = left + (right - left) / 2;
            if (array[mid] == k){
                break;
            }else if(array[mid] >  k){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        //找不到
        if (left > right){
            return 0;
        }
        int count = 1;
        int current = mid + 1;
        while (current <= right && array[current] == k){
            count++;
            current++;
        }
        current = mid - 1;
        while (current >= left && array[current] == k){
            current--;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4,5};
        System.out.println(getNumberOfK(array,6));
    }
}
