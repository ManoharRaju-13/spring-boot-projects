package spring1.example.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("wtsapp")
public class WhatsAppNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Whats App notification sent");
    }
}
