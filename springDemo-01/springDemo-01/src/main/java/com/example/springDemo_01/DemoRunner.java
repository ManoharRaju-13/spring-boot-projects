package com.example.springDemo_01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {
    PaymentGateway paymentGateway;
    DemoRunner(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.print();
    }
}
