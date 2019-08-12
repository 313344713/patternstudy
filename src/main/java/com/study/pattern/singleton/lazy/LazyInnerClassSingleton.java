package com.study.pattern.singleton.lazy;

/**
 * 懒汉式单例（内部类方式）
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton () {
        //防反射破坏
        if (LazyHolder.instance != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
}
