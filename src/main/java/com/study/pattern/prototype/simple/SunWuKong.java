package com.study.pattern.prototype.simple;

import com.study.pattern.prototype.JingGuBang;
import com.study.pattern.prototype.Monkey;
import lombok.Data;

import java.util.Date;

@Data
public class SunWuKong extends Monkey {

    private JingGuBang jingGuBang;

    public SunWuKong() {
        this.setBirthday(new Date());
        this.jingGuBang = new JingGuBang();
    }


    public SunWuKong shallowClone(SunWuKong target) {
        SunWuKong sunWuKong = new SunWuKong();
        sunWuKong.setHeight(target.getHeight());
        sunWuKong.setWeight(target.getWeight());
        sunWuKong.setBirthday(new Date());
        sunWuKong.setJingGuBang(target.getJingGuBang());
        return sunWuKong;
    }
}
