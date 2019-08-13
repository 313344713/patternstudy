package com.study.pattern.delegate;

public class EmployeeB implements IEmployee{

    public void work(String command) {
        System.out.println("我是员工B，开始工作" + command + "任务");
    }
}
