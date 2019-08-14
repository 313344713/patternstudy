package com.study.pattern.adapter;

/**
 *
 */
public class MediaPlayerServiceImpl implements MediaPlayerService {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)) {
            System.out.println("播放mp3, fileName：" + fileName);
        } else {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
