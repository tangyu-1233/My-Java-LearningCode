package com.yu.arraylisttest;

import java.util.ArrayList;

public class Test {
    static void main() {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("tangyu",23);

        Student s2 = new Student("dandan",23);

        Student s3 = new Student("chen",23);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.print("[");
        for(int i = 0; i < list.size(); i++) {
            if(i == 0) {
                System.out.print(list.get(i).getName() + list.get(i).getAge());
            } else {
                System.out.print("," + list.get(i).getName() + list.get(i).getAge());
            }


        }
        System.out.print("]");
    }
}
