package org.example;

import org.example.notifications.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    NotificationService notification;
    OrderService(@Qualifier("sms") NotificationService notification){
        this.notification = notification;
    }
    void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}
