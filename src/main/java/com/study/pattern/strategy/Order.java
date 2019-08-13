package com.study.pattern.strategy;

public class Order {

    private String orderNo;
    private String uid;
    private double amount;

    public Order(String orderNo, String uid, double amount) {
        this.orderNo = orderNo;
        this.uid = uid;
        this.amount = amount;
    }

    public String pay(String payName) {
        return PaymentStrategy.get(payName).pay(this.uid, this.amount);
    }
}
