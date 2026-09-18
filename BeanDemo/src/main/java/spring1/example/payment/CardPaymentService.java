package spring1.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



public class CardPaymentService implements PaymentService {
    @Override
    public void payment() {
        System.out.println("Card Payment Successfull");
    }
}
