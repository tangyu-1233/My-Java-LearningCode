package com.yu.datastructuretest;

public class Test2 {
    static void main() {
        int[] arr = {7, 23, 79, 81, 103, 123, 131, 147};
        System.out.println(getIndex(arr, 131));
    }

    public static int getIndex(int[] arr, int number) {
        // 二分查找
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] > number) {
                max = mid - 1;
            }
            if (arr[mid] < number) {
                min = mid + 1;
            }
        }

    }

}
