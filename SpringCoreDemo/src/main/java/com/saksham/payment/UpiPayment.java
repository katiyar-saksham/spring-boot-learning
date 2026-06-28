package com.saksham.payment;

import org.springframework.stereotype.Component;

//@Component
public class UpiPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
