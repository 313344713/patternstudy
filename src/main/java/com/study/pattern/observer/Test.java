package com.study.pattern.observer;

import com.google.common.eventbus.EventBus;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        GuavaEvent guavaEvent = new GuavaEvent();
        EventBus eventBus = new EventBus();
        eventBus.register(guavaEvent);

        Person question = createQuestionPerson();
        Person answer = createAnswerPerson();
        eventBus.post(question);
        eventBus.post(answer);

        Person answer2 = createAnswerPerson2();
        eventBus.post(answer2);
    }

    private static Content createQuestionContent() {
        Content content = new Content();
        content.setContent("观察者模式的使用场景？");
        content.setId("10000001");
        content.setType("提问");
        content.setCreateTime(new Date());
        return content;
    }

    private static Content createAnswerContent() {
        Content content = new Content();
        content.setContent("微信朋友圈动态通知、GPer 生态圈消息通知、邮件通知、广播通知、桌面程序的事件响应等");
        content.setId("10000001");
        content.setType("回答");
        content.setCreateTime(new Date());
        return content;
    }

    private static Person createQuestionPerson() {
        Person person = new Person("提问者", "张三", "GP190101", createQuestionContent());
        return person;
    }
    private static Person createAnswerPerson() {
        Person person = new Person("回答者", "李四", "GP180001", createAnswerContent());
        return person;
    }

    private static Content createAnswerContent2() {
        Content content = new Content();
        content.setContent("我也不知道啊!!");
        content.setId("10000001");
        content.setType("回答");
        content.setCreateTime(new Date());
        return content;
    }

    private static Person createAnswerPerson2() {
        Person person = new Person("回答者", "孙二", "GP190702", createAnswerContent2());
        return person;
    }
}
