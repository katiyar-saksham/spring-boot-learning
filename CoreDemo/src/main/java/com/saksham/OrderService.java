package com.saksham;

import com.saksham.notification.EmailService;
import com.saksham.notification.NotificationService;
import com.saksham.notification.PopUpNotification;
import com.saksham.notification.SmsService;

public class OrderService {
    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public OrderService() {
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
