package com.study.pattern.singleton.hungry;

/**
 * 饿汉式单例(静态块加载)
 * 线程绝对安全，类初始化就加载，不管用不用
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    private HungryStaticSingleton() {}

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }

}
