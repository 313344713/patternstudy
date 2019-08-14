package com.study.pattern.adapter;

/**
 * 媒体播放器,默认可以播放 mp3 格式的
 */
public interface MediaPlayerService {

    void play(String audioType, String fileNam);
}
