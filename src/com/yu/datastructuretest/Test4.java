package com.yu.datastructuretest;

public class Test4 {
    static void main() {
        //插入排序
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //找到无序的那一组的索引是从哪里开始的
        int startIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                startIndex = i + 1;
                break;
            }
        }

        //遍历无序数组
        for (int i = startIndex; i < arr.length; i++) {

            //找到插入的位置
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
