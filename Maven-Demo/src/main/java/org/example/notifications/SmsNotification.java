package org.example.notifications;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Sms Notification Sent");
    }
}
