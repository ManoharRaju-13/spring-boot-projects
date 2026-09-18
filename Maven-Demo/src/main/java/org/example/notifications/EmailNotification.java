package org.example.notifications;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification Sent");
    }
}
