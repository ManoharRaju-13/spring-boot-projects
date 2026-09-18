package com.example.springDemo_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.*;

@SpringBootApplication
public class SpringDemo01Application {
	public static void main(String[] args) {
//		ApplicationContext context =
		SpringApplication.run(SpringDemo01Application.class, args);
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

	}

}
