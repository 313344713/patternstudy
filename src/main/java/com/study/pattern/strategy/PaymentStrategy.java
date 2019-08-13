package com.study.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    public static Map<String, Payment> paymentMap = new HashMap<>();
    static {
        paymentMap.put(ALI_PAY, new AliPay());
        paymentMap.put(JD_PAY, new JDPay());
        paymentMap.put(UNION_PAY, new UnionPay());
    }

    public static Payment get(String payName) {
        Payment payment = null;
        if (paymentMap.containsKey(payName)) {
            payment = paymentMap.get(payName);
        } else {
            payment = paymentMap.get(DEFAULT_PAY);
        }
        return payment;
    }
}
