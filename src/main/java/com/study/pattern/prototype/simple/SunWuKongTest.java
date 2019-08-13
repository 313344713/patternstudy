package com.study.pattern.prototype.simple;

import com.study.pattern.prototype.JingGuBang;

public class SunWuKongTest {
    public static void main(String[] args) {
        JingGuBang jingGuBang = new JingGuBang();
        SunWuKong sunWuKong = new SunWuKong();
        sunWuKong.setWeight(2);
        sunWuKong.setHeight(10);
        sunWuKong.setJingGuBang(jingGuBang);

        SunWuKong copy = sunWuKong.shallowClone(sunWuKong);
        System.out.println(sunWuKong.getJingGuBang() == copy.getJingGuBang());

    }
}
