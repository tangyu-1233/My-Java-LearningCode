package com.yu.extendstest1;

public class Test {
    static void main() {
        Student s = new Student();
        s.name = "唐钰";
        s.age = 20;
        s.grade = "大二";
        System.out.println(s.name + "是" + s.grade + "的学生，现在" + s.age + "岁");

        s.study();
        s.eat();

        Teacher t = new Teacher();
        t.name = "王老师";
        t.age = 30;
        t.subject = "数学";
        System.out.println(t.name + "是" + t.subject + "的老师，现在" + t.age + "岁");
        t.teach();
        t.eat();


    }
}
