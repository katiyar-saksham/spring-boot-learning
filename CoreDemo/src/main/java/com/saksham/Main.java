package com.saksham;

import com.saksham.notification.EmailService;
import com.saksham.notification.FakeEmailService;
import com.saksham.notification.NotificationService;
import com.saksham.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] Args) {
        NotificationService notification = new EmailService();

//        OrderService od = new OrderService(notification);
        OrderService od = new OrderService();
        od.setNotification(notification);

        od.placeOrder();
    }
}