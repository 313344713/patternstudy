package com.study.pattern.singleton.hungry;

public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton == hungrySingleton2);

        HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton2 = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton == hungryStaticSingleton2);
    }
}
