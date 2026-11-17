package com.yu.studentsystempro;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoginSystem {
    static void main() {
        starLoginSystem();
    }

    public static void starLoginSystem() {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            //提示进入系统
            System.out.println("-------------------欢迎来到学生管理系统-------------------");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出");
            //用户输入选择
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> Login(list);
                case "2" -> Register(list);
                case "3" -> ForgetPassword(list);
                case "4" -> System.exit(0);
                default -> System.out.println("没有这个选项，请重新输入");
            }
        }
    }


    //创建注册方法
    public static void Register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请设置你的用户名：");
        String userName = sc.next();

        //----------------------------用户名输入-----------------------------------------------
        //判断用户名是否存在
        if (contains(list, userName)) {
            System.out.println("用户名已存在");
            return;
        }

        //用户名长度要在3~15之间
        if (userName.length() < 3 || userName.length() > 15) {
            System.out.println("用户名长度要在在3~15之间");
            return;
        }

        //用户名要求
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char name = userName.charAt(i);
            if ((name < 'a' || name > 'z') || (name < 'A' || name > 'Z') || (name < '0' || name > '9')) {
                System.out.println("用户名只能包含字母和数字");
                return;
            }

            if ((name >= 'a' && name <= 'z') || (name >= 'A' && name <= 'Z')) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("用户名需要同时包含字母和数字");
            return;
        }

        System.out.println("用户名注册成功");

        //----------------------------密码输入-----------------------------------------------
        //输入两次密码，两次密码要一致
        //判断密码正确
        String password;
        String confirmPassword;
        while (true) {
            System.out.println("请设置你的密码：");
            password = sc.next();
            System.out.println("请再次确认你的密码");
            confirmPassword = sc.next();
            if (!password.equals(confirmPassword)) {
                System.out.println("两次密码不一致,请重新设置你的密码");
                continue;
            }
            break;
        }

        System.out.println("密码设置成功");

        //----------------------------身份证输入-----------------------------------------------
        System.out.println("请输入身份证号：");
        String idCard = sc.next();
        //判断身份证号长度是否为18
        if (idCard.length() != 18) {
            System.out.println("身份证号长度要为18");
        }
        //身份证号第一个数字不能为0
        if (idCard.charAt(0) == '0') {
            System.out.println("身份证号第一个数字不能为0");
        }
        //前17位必须是数字
        for (int i = 0; i < idCard.length(); i++) {
            if (idCard.charAt(i) < '0' || idCard.charAt(i) > '9') {
                System.out.println("前17位必须是数字");
            }
        }
        //最后一个字符必须是0~9 或 'X' 或 'x'
        if (idCard.charAt(idCard.length() - 1) < '0' || idCard.charAt(idCard.length() - 1) > '9'
                && idCard.charAt(idCard.length() - 1) != 'X' && idCard.charAt(idCard.length() - 1) != 'x') {
            System.out.println("最后一个字符必须是0~9 或 'X' 或 'x'");
        }

        System.out.println("身份证输入成功");

        //----------------------------手机号输入-----------------------------------------------
        System.out.println("请输入手机号：");
        String phoneNumber = sc.next();
        //长度要为11位
        if (phoneNumber.length() != 11) {
            System.out.println("手机号长度要为11");
        }
        //不能以0开头
        if (phoneNumber.charAt(0) == '0') {
            System.out.println("手机号不能以0开头");
        }
        //手机号只能包含数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                System.out.println("手机号只能包含数字");
            }
        }

        System.out.println("手机号输入成功");

        //创建满足要求的对象并添加到集合中
        User u = new User(userName, password, idCard, phoneNumber);
        list.add(u);

        System.out.println("用户注册成功");
    }

    //创建登录方法
    public static void Login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        //----------------------------用户名输入-----------------------------------------------
        System.out.println("请输入用户名");
        String userName = sc.next();
        //判断用户名是否存在
        if (!contains(list, userName)) {
            System.out.println("用户未注册，请先注册");
            return;
        }

        //----------------------------密码和验证码输入-----------------------------------------------

        //判断验证码和密码是否正确，3次机会
        for (int i = 0; i < 3; ) {
            System.out.println("请输入你的密码");
            //输入密码
            String inputPassword = sc.next();
            //正确的密码
            String password = list.get(getIndex(list, userName)).getPassword();
            if (!password.equals(inputPassword)) {
                System.out.println("密码错误，请重新输入");
                i++;
                if (i == 3) {
                    System.out.println("3次密码均错误，登录失败");
                    return;
                }
                continue;
            }

            System.out.println("密码正确");
            break;
        }

        //生成验证码
        String code = generateCode();
        System.out.println("验证码为：" + code);
        for (int i = 0; i < 3; ) {
            System.out.println("请输入验证码");
            String inputCode = sc.next();
            if (!inputCode.equals(code)) {
                System.out.println("验证码错误，请重新输入");
                i++;
                if (i == 3) {
                    System.out.println("3次验证码均错误，登录失败");
                    return;
                }
                continue;
            }

            System.out.println("验证码正确");
            break;
        }

        System.out.println("登录成功");

    }

    //创建忘记密码方法
    public static void ForgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        //----------------------------用户名输入-----------------------------------------------
        System.out.println("请输入用户名");
        String userName = sc.next();
        //判断用户名是否存在
        if (!contains(list, userName)) {
            System.out.println("用户未注册，请先注册");
            return;
        }

        //得到该用户名的索引
        int index = getIndex(list, userName);

        //键盘录入身份证号和手机号
        System.out.println("请输入身份证号");
        String idCard = sc.next();
        System.out.println("请输入手机号");
        String phone = sc.next();

        //记录正确的身份证号和手机号
        String trueIdCard = list.get(index).getIdCard();
        String truePhone = list.get(index).getPhoneNumber();

        //判断二者是否正确
        if (!idCard.equals(trueIdCard) || !phone.equals(truePhone)) {
            System.out.println("账号信息不匹配");
            return;
        }

        //正确，修改密码
        System.out.println("验证通过，请重新设置你的密码");
        String newPassword = sc.next();

        //覆盖原来的密码
        //得到要修改的对象
        User user = list.get(index);
        user.setPassword(newPassword);

        System.out.println("新密码修改成功");
    }

    //判断用户名是否存在
    public static boolean contains(ArrayList<User> list, String userName) {
       /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return true;
            }
        }
        return false;*/

        return getIndex(list, userName) >= 0;
    }

    //根据用户名获取索引
    public static int getIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    //创建生成验证码方法
    public static String generateCode() {
        //把所有英文字母放到数组中
        char[] code = new char[52];
        for (int i = 0; i < code.length; i++) {
            if (i <= 25) {
                //添加小写字母
                code[i] = (char) (97 + i);
            } else {
                //添加大写字母
                code[i] = (char) (65 + i - 26);
            }
        }

        String codeStr = "";
        //随机生成4个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(code.length);
            codeStr = code[index] + codeStr;
        }

        //生成一个数字
        int num = r.nextInt(10);
        codeStr = codeStr + num;

        //把验证码转换为字符数组
        char[] codeArr = codeStr.toCharArray();
        //随机打乱验证码
        for (int i = 0; i < codeArr.length; i++) {
            int randomIndex = r.nextInt(codeArr.length);
            char temp = codeArr[0];
            codeArr[0] = codeArr[randomIndex];
            codeArr[randomIndex] = temp;
        }
        String endCode = new String(codeArr);
        return endCode;
    }

}
