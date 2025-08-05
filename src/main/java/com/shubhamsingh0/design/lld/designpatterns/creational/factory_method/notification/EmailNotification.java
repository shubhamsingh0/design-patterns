package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailNotification implements Notification {
    private String toEmailAddress;
    private String fromEmailAddress;
    private String subject;
    private String body;

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification from: " + fromEmailAddress);
        System.out.println("To Email Address: " + toEmailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Sending Email Notification message: " + message);
        System.out.println("Email sent successfully!");
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification from: " + fromEmailAddress);
        System.out.println("To Email Address: " + toEmailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Sending Email Notification message: " + body);
        System.out.println("Email sent successfully!");
    }
}
