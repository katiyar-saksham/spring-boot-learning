package com.saksham;

import jdk.jfr.Category;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Payment done");
    }
}
