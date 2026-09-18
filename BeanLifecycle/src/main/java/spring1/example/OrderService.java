package spring1.example;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    OrderService() {
        System.out.println("Order Service Object created");
    }
}
