package com.study.pattern.strategy;

public abstract class Payment {

    public abstract String getName();

    public abstract double queryBalance();

    public String pay(String uid, double amount) {
        String msg = null;
        if (queryBalance() < amount) {
            msg = "余额不足";
        } else {
            msg = "用户：" + uid + " 支付成功，支付方式：" + this.getName() + ",支付金额：" + amount;
        }
        return msg;
    }
}
