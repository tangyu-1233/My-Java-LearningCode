package com.yu.datastructuretest;

import java.util.ArrayList;

public class Test1 {
    static void main() {
        // 线性查找
        int[] arr = {131, 123, 345, 765, 91, 78, 91};
        System.out.println(getIndex(arr, 91));
    }

    public static ArrayList<Integer> getIndex(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
