package com.yu.packageclasstest;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test4 {
    static void main(){
        //计算自己活了多少天
        LocalDate id1 = LocalDate.of(2006, 7, 6);
        LocalDate now = LocalDate.now();

        long days = ChronoUnit.DAYS.between(id1, now);
        System.out.println(days);

    }
}
