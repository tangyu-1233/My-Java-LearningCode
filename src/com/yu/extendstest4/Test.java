package com.yu.extendstest4;

public class Test {
    static void main() {
        Laptop l = new Laptop();
        l.name = "Lenovo";
        l.price = 5000;
        System.out.println(l.getPrice());

        Phone p = new Phone();
        p.name = "Apple";
        p.price = 5000;
        System.out.println(p.getPrice());
    }
}
