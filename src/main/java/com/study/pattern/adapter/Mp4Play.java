package com.study.pattern.adapter;

public class Mp4Play implements AdvancedMediaPlayerService {


    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4, fileName：" + fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
