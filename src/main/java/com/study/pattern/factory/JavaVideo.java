package com.study.pattern.factory;

/**
 * Java 视频
 */
public class JavaVideo implements IVideo{

    @Override
    public void play() {
        System.out.println("播放Java视频");
    }
}
