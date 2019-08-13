package com.study.pattern.strategy;

public class AliPay extends Payment{
    @Override
    public String getName() {
        return "阿里支付";
    }

    @Override
    public double queryBalance() {
        return 300;
    }
}
