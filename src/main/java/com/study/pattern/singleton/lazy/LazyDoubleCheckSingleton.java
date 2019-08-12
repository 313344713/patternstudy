package com.study.pattern.singleton.lazy;

/**
 * 懒汉式单例（双层校验）
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton() {}

    /**
     * 加锁前加锁后各判断一次
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
