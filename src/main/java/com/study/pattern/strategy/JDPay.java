package com.study.pattern.strategy;

public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    public double queryBalance() {
        return 108;
    }
}
