package com.study.pattern.proxy.dynamicproxy.cglib;

public class CGlibMeipoTest {

    public static void main(String[] args) {
        Girl girl = (Girl) new CGlibMeipo().getInstance(Girl.class);
        girl.findLove();
    }
}
