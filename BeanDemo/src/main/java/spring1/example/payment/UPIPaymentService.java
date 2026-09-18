package spring1.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class UPIPaymentService implements PaymentService {
    @Override
    public void payment() {
        System.out.println("UPI payment successfull");
    }
}
