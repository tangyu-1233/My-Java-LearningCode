package com.yu.datastructuretest;

public class Test5 {
    static void main() {
        //递归调用
        System.out.println(jc(5));
    }

    public static int jc(int num) {
        if(num == 0){
            return 1;
        }
        return num * jc(num - 1);
    }
}
