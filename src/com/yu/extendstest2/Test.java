package com.yu.extendstest2;

public class Test {
    static void main() {
        Android a = new Android();
        a.brand = "iqoo";
        a.price = 1999;
        System.out.println(a.brand + "的" + a.price + "元的手机");

        a.NFC();
        a.call();
        a.sendMessage();

        Ios i = new Ios();
        i.brand = "apple";
        i.price = 5999;
        System.out.println(i.brand + "的" + i.price + "元的手机");
        i.call();
        i.sendMessage();

        Laptop l = new Laptop();
        l.brand = "dell";
        l.price = 9999;
        System.out.println(l.brand + "的" + l.price + "元的笔记本");
        l.coding();
    }
}
