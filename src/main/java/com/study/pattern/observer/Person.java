package com.study.pattern.observer;

import com.google.common.eventbus.Subscribe;
import lombok.Data;

@Data
public class Person {

    /**
     * 提问者，回答者
     */
    private String type;

    /**
     * 姓名
     */
    private String name;

    /**
     * 学号
     */
    private String no;

    private Content content;


    public Person(String type, String name, String no, Content content) {
        this.type = type;
        this.name = name;
        this.no = no;
        this.content = content;
    }

}
