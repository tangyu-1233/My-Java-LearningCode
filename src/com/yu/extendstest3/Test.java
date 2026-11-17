package com.yu.extendstest3;

public class Test {
    static void main() {
        FirstGenerationFhone fp = new FirstGenerationFhone();
        fp.call();

        SecondGenerationPhone sp = new SecondGenerationPhone();
        sp.call();
        sp.sendMessage();

        ThirdGenerationPhone tp = new ThirdGenerationPhone();
        tp.call();
        tp.PlayGame();
        tp.sendMessage();
    }
}
