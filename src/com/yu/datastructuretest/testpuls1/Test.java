package com.yu.datastructuretest.testpuls1;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    static void main() {
        GirlFriend g1 = new GirlFriend("dandan", 18, 1.65);
        GirlFriend g2 = new GirlFriend("lili", 19, 1.68);
        GirlFriend g3 = new GirlFriend("mimi", 20, 1.7);

        GirlFriend arr[] = {g1, g2, g3};

        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if(temp > 0) {
                    return 1;
                } else if(temp < 0) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
