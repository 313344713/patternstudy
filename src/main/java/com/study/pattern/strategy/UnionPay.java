package com.study.pattern.strategy;

public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance() {
        return 500;
    }
}
