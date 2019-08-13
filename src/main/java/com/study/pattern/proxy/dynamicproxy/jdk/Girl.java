package com.study.pattern.proxy.dynamicproxy.jdk;

import com.study.pattern.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("开始找对象");
        System.out.println("优先高富帅");
    }
}
