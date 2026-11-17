package com.yu.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    static void main() {
        starStudentSystem();
    }

    public static void starStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------欢迎来到黑马学生管理系统--------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(list)
                ;
                case "2" -> deleteStudent(list)
                ;
                case "3" -> modifyStudent(list)
                ;
                case "4" -> queryStudent(list)
                ;
                case "5" -> System.exit(0)
                ;
                default -> System.out.println("您输入的选择有误，请重新输入");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID：");
            String ID = sc.next();
            if (contains(list, ID)) {
                System.out.println("该ID已存在，请重新输入");
                continue;
            } else {
                stu.setID(ID);
                break;
            }
        }


        System.out.println("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生地址：");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);
        System.out.println("添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID：");
        String ID = sc.next();
        int index = getIndex(list, ID);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("该ID不存在,删除失败");
        }
    }

    public static void modifyStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生ID：");
        String ID = sc.next();
        int index = getIndex(list, ID);
        if (index == -1) {
            System.out.println("要修改的学生ID " + ID + " 不存在,修改失败");
            return;
        }
        //得到要修改的对象
        Student stu = list.get(index);
        //修改该学号学生的信息
        System.out.println("请修改该学生的姓名：");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请修改该学生的年龄：");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请修改该学生的地址：");
        String address = sc.next();
        stu.setAddress(address);

        System.out.println("修改成功");
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        //制作表头
        System.out.println("ID\t姓名\t年龄\t地址");
        //便利集合打印学生信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getID() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String ID) {
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, ID) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

}
