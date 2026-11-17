package com.yu.packageclasstest;

import java.time.LocalDate;

public class Test5 {
    static void main() {
        //判断某一年是否为闰年
        //设定时间为2000年3月1日
        LocalDate id1 = LocalDate.of(2000,3,1);
        //把时间往前1减一天
        LocalDate id2 = id1.minusDays(1);
        //获取这一天为2月的第几天
        int day = id2.getDayOfMonth();
        if(day == 29){
            System.out.println(id1.getYear()+"年是闰年");
        }else{
            System.out.println(id1.getYear()+"年不是闰年");
        }

        //isLeapYear()方法
        System.out.println(id1.getYear()+"年是否闰年："+id1.isLeapYear());
    }
}
