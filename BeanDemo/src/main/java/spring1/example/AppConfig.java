package spring1.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import spring1.example.notification.NotificationService;
import spring1.example.payment.CardPaymentService;
import spring1.example.payment.PaymentService;
import spring1.example.payment.UPIPaymentService;


@Configuration
@ComponentScan
public class AppConfig {
   @Bean
    OrderService createOrder(@Qualifier("upi") PaymentService payment, @Qualifier("sms") NotificationService notification){
       return new OrderService(payment, notification);
   }

   @Qualifier("card")
   @Bean
    PaymentService createCardPayment(){
       return new CardPaymentService();
   }
   @Qualifier("upi")
   @Bean
    PaymentService createUPIPayment(){
       return new UPIPaymentService();
   }
}
