package com.study.pattern.proxy.dynamicproxy.myproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理，代理对象
 */
public class MyMeipo implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("my媒婆准备工作");
    }

    public void after() {
        System.out.println("my媒婆收尾工作");
    }
}
