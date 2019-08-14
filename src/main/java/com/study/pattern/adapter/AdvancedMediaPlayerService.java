package com.study.pattern.adapter;

public interface AdvancedMediaPlayerService {

    /**
     * 播放 mp4
     * @param fileName
     */
    void playMp4(String fileName);

    /**
     * 播放 vlc
     * @param fileName
     */
    void playVlc(String fileName);
}
