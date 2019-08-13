package com.study.pattern.prototype;

import lombok.Data;

import java.io.Serializable;

@Data
public class JingGuBang implements Serializable {

    private float h;

    private float w;

    public void big() {
        this.h = this.h * 2;
        this.w = this.w * 2;
    }

    public void small() {
        this.h = this.h / 2;
        this.w = this.w / 2;
    }
}
