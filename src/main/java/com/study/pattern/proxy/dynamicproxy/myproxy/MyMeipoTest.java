package com.study.pattern.proxy.dynamicproxy.myproxy;

import com.study.pattern.proxy.dynamicproxy.jdk.Girl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyMeipoTest {
    public static void main(String[] args) {
        MyMeipo meipo = new MyMeipo();
        Object proxy = meipo.getInstance(new Girl());
        try {
            Method method = proxy.getClass().getMethod("findLove", null);
            method.invoke(proxy);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
