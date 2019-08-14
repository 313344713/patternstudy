package com.study.pattern.observer;


import lombok.Data;

import java.util.Date;

@Data
public class Content {

    /**
     * 问题编号
     */
    private String id;

    /**
     * 提问/回答
     */
    private String type;

    /**
     * 内容
     */
    private String content;

    /**
     * 时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "Content{" +
                "编号：'" + id + '\'' +
                "type：'" + type + '\'' +
                ", 内容：'" + content + '\'' +
                ", 时间：" + createTime +
                '}';
    }
}
