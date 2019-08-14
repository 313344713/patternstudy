package com.study.pattern.template;

public abstract class AbstractGame {

    /**
     * 步骤一 初始化游戏 （固定不变的在父类实现）
     */
    public final void init() {
        System.out.println("----启动XX游戏----");
    };

    /**
     * 步骤二 玩游戏（交由子类实现）
     */
    public abstract void play();

    /**
     * 钩子方法，是否需要挂机
     * @return
     */
    public boolean needAutoPlay() {
        return false;
    }

    public void autoPlay() {
        System.out.println("自动挂机升级");
    }

    /**
     * 关闭游戏
     */
    public final void close() {
        System.out.println("----关闭游戏----");
    };

    public final void playGame () {
        init();
        play();
        if (needAutoPlay()) {
            autoPlay();
        }
        close();
    }
}
