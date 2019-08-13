package com.study.pattern.prototype.deep;

import com.study.pattern.prototype.JingGuBang;


public class SunWuKongTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        JingGuBang jingGuBang = new JingGuBang();
        SunWuKong sunWuKong = new SunWuKong();
        sunWuKong.setWeight(2);
        sunWuKong.setHeight(10);
        sunWuKong.setJingGuBang(jingGuBang);

        SunWuKong copy = (SunWuKong) sunWuKong.clone();
        System.out.println(sunWuKong.getJingGuBang() == copy.getJingGuBang());

    }
}
