package com.study.pattern.factory;

/**
 * Python 视频
 */
public class PythonVideo implements IVideo{

    @Override
    public void play() {
        System.out.println("播放Python视频");
    }
}
