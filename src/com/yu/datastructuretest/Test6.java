package com.yu.datastructuretest;

public class Test6 {
    static void main() {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void quickSort(int arr[], int i, int j) {
        if(i > j){
            return;
        }

        int start = i;
        int end = j;
        int baseNumber = arr[i];


        while (start < end) {
            //从end往前遍历，找到比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            //从start往后遍历，找到比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        //将基准数与对应位置元素交换
        arr[i] = arr[start];
        arr[start] = baseNumber;

        //递归调用解决基准数左边的区域
        quickSort(arr, i, start - 1);

        //递归调用解决基准数左边的区域
        quickSort(arr, start + 1, j);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
