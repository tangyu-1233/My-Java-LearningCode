package com.yu.String;

import java.util.Random;

public class Test {
    static void main() {
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

        char[] codeArr = codeStr.toCharArray();
        for (int i = 0; i < codeArr.length; i++) {
            int randomIndex = r.nextInt(codeArr.length);
            char temp = codeArr[0];
            codeArr[0] = codeArr[randomIndex];
            codeArr[randomIndex] = temp;
        }
        String endCode = new String(codeArr);
        System.out.println(endCode);
    }
}
