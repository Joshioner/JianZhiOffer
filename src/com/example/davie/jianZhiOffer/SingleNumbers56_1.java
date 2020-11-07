package com.example.davie.jianZhiOffer;

public class SingleNumbers56_1 {
    public int[] singleNumbers(int[] nums) {
           if (nums.length == 0){
               return new int[0];
           }
           int ret = 0;
           //得到两个出现一次的数字的异或的值
        for (int num : nums) {
            ret ^= num;
        }
        int div = 1;
        //分组，根据异或结果，判断哪位为1，说明这两个数字该位的 0 1 不相同，可将这位作为两个异或数字分组的依据
        while ((ret & div) == 0){
            div <<= 1;
        }
        int a = 0;
        int b = 0;
        for (int num:nums){
            if ((num & div) == 0){
                a ^= num;
            }else {
                b ^= num;
            }
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        System.out.println((10 >> 1));
    }
}
