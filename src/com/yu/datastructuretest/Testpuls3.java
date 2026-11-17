package com.yu.datastructuretest;

public class Testpuls3 {
    static void main() {
        System.out.println(getCount(1));
    }

    public static int getCount(int day) {
        if (day == 10) {
            return 1;
        }
        return (getCount(day + 1) + 1) * 2;



    }
}
