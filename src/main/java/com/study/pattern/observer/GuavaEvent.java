package com.study.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void questionOrAnswer(Person person){
        System.out.println("GPer社区有动态：  姓名：" + person.getName() + ",学号："+ person.getNo() + person.getContent());
    }
}
