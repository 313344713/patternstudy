package com.study.pattern.adapter;

public class VlcPlay implements AdvancedMediaPlayerService {


    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VLC, fileName：" + fileName);
    }
}
