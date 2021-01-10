package com.example.davie.toutiao;

public class FindKthLargest_215 {
//    public static int findKthLargest(int[] nums, int k) {
//        if (nums == null || nums.length <= 0 ||  k <= 0 || nums.length < k){
//            return 0;
//        }
//        return quickSelect(nums,0,nums.length - 1,nums.length - k);
//    }
//    public static int quickSelect(int[] nums,int left,int right,int k){
//        int index = findIndex(nums,left,right);
//        if (index == k){
//            return nums[index];
//        }
//        return index > k ? quickSelect(nums,left,index - 1,k) : quickSelect(nums,index + 1,right,k);
//
//    }
//    public static int findIndex(int[] nums,int left,int right){
//        int target = nums[left];
//        while (left < right){
//            while (left < right && nums[right] >= target){
//                right--;
//            }
//            if (left <right){
//                nums[left] = nums[right];
//            }
//            while (left < right && nums[left] < target){
//                left++;
//            }
//            if (left < right){
//                nums[right] = nums[left];
//            }
//        }
//        nums[left] = target;
//        return left;
//    }

    public static int findKthLargest(int[] nums, int k) {
      if (nums == null || nums.length <= 0 ||  k <= 0 || nums.length < k){
            return 0;
        }
      int[] res = new int[k];
      for (int i = 0;i < k;i++){
          res[i] = nums[i];
      }
      //构建最小堆
        for (int i = res.length / 2;i >= 0;i--){
            downData(res,i);
        }
        //遍历K之后的数字，如果比最小堆的堆顶大，则将堆顶替换为对应的值，调整最小堆
        for (int i = k;i < nums.length;i++){
            if (nums[i] > res[0]){
                res[0] = nums[i];
                downData(res,0);
            }
        }
        return res[0];

    }
    public static void downData(int[] num,int i){
        if (i >= num.length){
            return;
        }
        int minIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        if (leftIndex < num.length && num[leftIndex] < num[minIndex]){
             minIndex = leftIndex;
        }
        if (rightIndex < num.length && num[rightIndex] < num[minIndex]){
            minIndex = rightIndex;
        }
        if (minIndex != i){
            //交换值
            swap(num,i,minIndex);
            downData(num,minIndex);
        }
    }
    public static void swap(int[] num,int i,int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));
    }
}
