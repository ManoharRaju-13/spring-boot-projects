package com.example.springDemo_01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    private final PaymentGatewayProperties properties;

    public PaymentGateway(PaymentGatewayProperties properties) {
        this.properties = properties;
    }

    public String getType() {
        return properties.getType();
    }

    public int getRetryCount() {
        return properties.getRetryCount();
    }

    public boolean isEnabled() {
        return properties.isEnabled();
    }

    public int getTimeOut() {
        return properties.getTimeOut();
    }
    public void print() {
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(getTimeOut());
        System.out.println(isEnabled());
    }
}