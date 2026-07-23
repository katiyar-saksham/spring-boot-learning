package com.saksham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);//Uses Reflection
//        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();


        User u = context.getBean(User.class);
        System.out.println(u.getName());
        ;
    }
}


