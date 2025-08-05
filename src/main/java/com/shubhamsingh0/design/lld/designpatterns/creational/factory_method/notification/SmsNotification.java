package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SmsNotification implements Notification {
    private String toPhoneNumber;
    private String fromPhoneNumber;
    private String message;

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification from: " + fromPhoneNumber);
        System.out.println("To Phone Number: " + toPhoneNumber);
        System.out.println("Sending SMS Notification: " + message);
        System.out.println("SMS sent successfully!");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification from: " + fromPhoneNumber);
        System.out.println("To Phone Number: " + toPhoneNumber);
        System.out.println("Sending SMS Notification: " + message);
        System.out.println("SMS sent successfully!");
    }
}
