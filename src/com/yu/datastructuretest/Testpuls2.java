package com.yu.datastructuretest;

public class Testpuls2 {
    static void main() {
        int []arr = new int[12];

         arr[0] = 1;
         arr[1] = 1;
         for(int i = 2; i < arr.length; i++) {
             arr[i] = arr[i-1] + arr[i-2];
         }
        System.out.println(arr[11]);
        System.out.println(getSum(11));
    }

    public static int getSum(int mouth){
        if(mouth == 0 || mouth == 1) {
            return 1;
        }
        return getSum(mouth-1) + getSum(mouth-2);
    }
    }
