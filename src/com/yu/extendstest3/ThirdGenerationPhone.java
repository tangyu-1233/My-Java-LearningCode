package com.yu.extendstest3;

public class ThirdGenerationPhone extends SecondGenerationPhone{
    @Override
    public void call() {
        System.out.println("正在打视频电话~");
    }

    public void PlayGame(){
        System.out.println("正在玩游戏~");
    }

}
