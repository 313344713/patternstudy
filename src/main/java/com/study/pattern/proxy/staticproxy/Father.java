package com.study.pattern.proxy.staticproxy;

import com.study.pattern.proxy.Person;

public class Father implements Person {
    private Son son;
    public Father(Son son){
        this.son = son;
    }

    @Override
    public void findLove() {
        before();
        son.findLove();
        after();
    }

    public void before() {
        System.out.println("准备工作");
    }

    public void after() {
        System.out.println("收尾工作");
    }
}
