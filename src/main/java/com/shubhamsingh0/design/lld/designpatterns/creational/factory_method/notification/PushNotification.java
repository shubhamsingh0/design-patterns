package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PushNotification implements Notification {
    private String toDeviceToken;
    private String fromDeviceToken;
    private String message;
    private String title;

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification from: " + fromDeviceToken);
        System.out.println("To Device Token: " + toDeviceToken);
        System.out.println("With Title: " + title);
        System.out.println("Sending Push Notification Message: " + message);
        System.out.println("Push sent successfully!");
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification from: " + fromDeviceToken);
        System.out.println("To Device Token: " + toDeviceToken);
        System.out.println("With Title: " + title);
        System.out.println("Sending Push Notification Message: " + message);
        System.out.println("Push sent successfully!");
    }
}
