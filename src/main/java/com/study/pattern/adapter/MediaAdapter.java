package com.study.pattern.adapter;

public class MediaAdapter implements MediaPlayerService {

    AdvancedMediaPlayerService advancedMusicPlayer;


    public MediaAdapter(String audioType){
        if ("mp4".equals(audioType)) {
            advancedMusicPlayer = new Mp4Play();
        } else if ("vlc".equals(audioType)) {
            advancedMusicPlayer = new VlcPlay();
        }
    }

    @Override
    public void play(String audioType, String fileNam) {
        if ("mp4".equals(audioType)) {
            advancedMusicPlayer.playMp4(fileNam);
        } else if ("vlc".equals(audioType)) {
            advancedMusicPlayer.playVlc(fileNam);
        }
    }
}
