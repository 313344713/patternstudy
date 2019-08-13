package com.study.pattern.delegate;

public class EmployeeA implements IEmployee{

    public void work(String command) {
        System.out.println("我是员工A，开始工作" + command + "任务");
    }
}
