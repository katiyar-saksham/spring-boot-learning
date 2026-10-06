package com.saksham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();


        User u = context.getBean(User.class);
        System.out.println(u.getName());
        System.out.println(u.getAge());
    }
}


