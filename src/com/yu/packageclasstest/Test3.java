package com.yu.packageclasstest;

public class Test3 {
    static void main() {
        //手动实现2进制的转换，考虑用到sb.reverse()
        toBinaryString(6);

    }

    private static void toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = num % 2;
            sb.append(i);
            num = num / 2;
            if (num == 0) {
                break;
            }
        }
        System.out.println(sb.reverse());
    }
}
