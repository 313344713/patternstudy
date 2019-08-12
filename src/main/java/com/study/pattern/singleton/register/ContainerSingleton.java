package com.study.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例（容器方式）
 * 用于注册大量单例
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();
    private ContainerSingleton (){}

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className,object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return ioc.get(className);
            }
        }
    }
}
