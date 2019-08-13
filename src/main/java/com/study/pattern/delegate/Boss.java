package com.study.pattern.delegate;

public class Boss {

    public void command(Leader leader, String command) {
        leader.work(command);
    }
}
