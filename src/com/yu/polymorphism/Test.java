package com.yu.polymorphism;

public class Test {
    static void main() {
        /*Person p = new Person("老王",30);
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setColor("黑");
        p.keepPet(dog,"骨头");

        Person p2 = new Person("老唐",40);
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setColor("黑");
        p2.keepPet(cat,"鱼");*/

        Person p = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        d.lookHome();
        Cat c = new Cat(3,"灰");
        c.catchMouse();
        p.keepPet(d,"骨头");//此时括号内Dog类自动转为Animail类
        p.keepPet(c,"鱼");

    }
}
