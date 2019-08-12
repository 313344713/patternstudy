package com.study.pattern.singleton.threadlocal;

/**
 *  线程单例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton () {}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }

}
