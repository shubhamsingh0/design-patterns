package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public class EmailNotificationFactoryImpl implements NotificationFactory<EmailNotificationParams> {
    @Override
    public Notification createNotification(EmailNotificationParams params) {
        return new EmailNotification(
            params.getToEmailAddress(),
            params.getFromEmailAddress(),
            params.getSubject(),
            params.getBody()
        );
    }
}
