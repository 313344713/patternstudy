package com.study.pattern.template;

public class OneGame extends AbstractGame{

    @Override
    public boolean needAutoPlay() {
        return true;
    }

    @Override
    public void play() {
        System.out.println("小A这样玩游戏，先打小怪");
    }
}
