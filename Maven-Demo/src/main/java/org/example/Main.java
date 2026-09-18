package org.example;


import org.example.notifications.EmailNotification;
import org.example.notifications.NotificationService;
import org.example.notifications.SmsNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
}
}