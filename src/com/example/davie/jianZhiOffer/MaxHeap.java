package com.example.davie.jianZhiOffer;

import java.util.Arrays;

public class MaxHeap {
    private int[] data;  //存放数据的数组
    private int size;    //当前堆的大小
    private int capacity; //堆的最大容量

    private MaxHeap(int maxSize){
        data = new int[size];
        this.size = data.length;
        this.capacity = maxSize;
    }
    //获取父节点下标
    public int parentIndex(int i){
        if (i <= 0 || i >= capacity){
            return -1;
        }
        return (i-1)/2;
    }
    //获取左节点下标
    public int leftChild(int i){
        if (2 * i + 1 >= size){
            return -1;
        }
        return 2 * i + 1;
    }
    //获取右节点下标
    public int rightChild(int i){
        return 2 * i + 2 >= size ? -1:2 * i + 2;
    }

    /**
     * 插入元素
     * 1.判断当前容量大小，如果容量刚好等于当前堆的个数，则扩容为原来的两倍
     * 2.将元素插到 size + 1下标位置
     * 3.将当前元素与父节点比较，如果比父节点大，则交换值，直到比父节点小
     * @param num
     */
    public void insert(int num){
        //扩容
      if (capacity == size){
          resizeHeap();
      }
      size += 1;
      int i = size -1;
      while (i >= 0 && num > data[parentIndex(i)]){
          data[i] = data[parentIndex(i)];
          i = (i-1)/2;
      }
      data[i]= num;
    }

    public void resizeHeap(){
        int[] array_old = Arrays.copyOf(data,2 * capacity);
        this.data = array_old;
        array_old = null;
        this.capacity =  2 * capacity;
    }

    /**
     * 下沉元素
     * 1：
     * @param index
     */
    public void downData(int index){
       if (index < 0 || index >= size){
           return;
       }
       int left = leftChild(index);
       int right = rightChild(index);
       int max = index;
       if (left != -1 && data[left] > data[max]){
           max = left;
       }
       if (right != -1 && data[right] > data[max]){
           max = right;
       }
       if (max != index){
           //交换值
           swapData(max,index);
           downData(max);
       }
    }

    public int deleteMax(){
        if (this.size == 0){
            return -1;
        }
        int num = data[0];
        this.data[0] = this.data[size - 1];
        size -=1;
        downData(0);
        return num;
    }

    public void swapData(int i,int j){
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }

    public void buildHeap(int[] arr){
       if (arr ==null || arr.length == 0){
           return;
       }
       this.data = arr;
       this.size = data.length;
       this.capacity = size *2;
       for (int  i = (arr.length - 1)/2; i >= 0;i--){
           downData(i);
       }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        MaxHeap maxHeap = new MaxHeap(arr.length * 2);
        maxHeap.buildHeap(arr);
        System.out.println(Arrays.toString(maxHeap.data));
    }

}
