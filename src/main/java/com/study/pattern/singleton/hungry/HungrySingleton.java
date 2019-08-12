package com.study.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 线程绝对安全，类初始化就加载，不管用不用
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
