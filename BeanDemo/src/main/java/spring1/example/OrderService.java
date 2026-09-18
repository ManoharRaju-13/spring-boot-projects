package spring1.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring1.example.notification.NotificationService;
import spring1.example.payment.PaymentService;

public class OrderService {
   private final PaymentService payment;
   private final NotificationService notification;
   OrderService(PaymentService payment, NotificationService notification) {
       this.notification = notification;
       this.payment = payment;
   }
    public void placeOrder() {
        payment.payment();
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}
