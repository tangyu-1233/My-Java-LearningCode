package com.yu.packageclasstest;

import java.util.Scanner;

public class Test2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个整数");
             str = sc.nextLine();
            //判断输入字符串的是否符合格式  [1-9]\\d{0,9}
            if (str.matches("[1-9]\\d{0,9}")) {
                System.out.println("输入的字符串符合格式");
                break;
            } else {
                System.out.println("输入的字符串不符合格式");
                continue;
            }
        }
            //int num = Integer.parseInt(str);
            //自己实现parseInt方法
        parseInt(str);


    }

    private static void parseInt(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            num = num * 10 + c;
        }
        System.out.println(num);
    }
}
