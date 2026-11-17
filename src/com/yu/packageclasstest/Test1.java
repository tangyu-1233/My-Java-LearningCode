package com.yu.packageclasstest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    static void main() {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //接受1-100之间的整数
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("请输入1-100之间的整数");
            String numStr = sc.nextLine();
            int num =  Integer.parseInt(numStr);
            if(num < 1 || num > 100){
                System.out.println("请输入1-100之间的整数");
                continue;
            }
            list.add(num);
            sum = sum + num;
            if(sum > 200){
                System.out.println("集合中所有元素的和大于200了");
                break;
            }
        }
        System.out.println(list);

    }
}
