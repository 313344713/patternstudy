package com.study.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{

    public Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("login", new EmployeeA());
        targets.put("register", new EmployeeB());
    }

    @Override
    public void work(String command) {
        IEmployee employee = targets.get(command);
        if (employee != null) {
            employee.work(command);
        } else {
            System.out.println("任务待定");
        }

    }
}
