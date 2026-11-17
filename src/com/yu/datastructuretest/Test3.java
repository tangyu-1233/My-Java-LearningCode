package com.yu.datastructuretest;

public class Test3 {
    static void main() {
        //冒泡排序
        int[] arr = {2, 4, 3, 5, 1};

        //外层循环表示要执行的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环表示交换相邻元素，要比较的次数，每比较一次 - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

        //选择排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
