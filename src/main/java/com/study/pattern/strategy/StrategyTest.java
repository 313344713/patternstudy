package com.study.pattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("DL1000001", "dl1992", 189);
        System.out.println(order.pay(order.pay(PaymentStrategy.ALI_PAY)));
    }
}
