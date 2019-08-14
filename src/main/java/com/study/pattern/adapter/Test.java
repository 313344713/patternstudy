package com.study.pattern.adapter;

public class Test {

    public static void main(String[] args) {
        MediaPlayerService service = new MediaPlayerServiceImpl();
        service.play("mp4", "adapter.mp4");
        service.play("mp3", "adapter.mp3");
    }
}
