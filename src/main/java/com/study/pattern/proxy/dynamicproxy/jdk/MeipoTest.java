package com.study.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MeipoTest {
    public static void main(String[] args) {
        Meipo meipo = new Meipo();
        Object proxy = meipo.getInstance(new Girl());
        try {
            Method method = proxy.getClass().getMethod("findLove", null);
            method.invoke(proxy);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
