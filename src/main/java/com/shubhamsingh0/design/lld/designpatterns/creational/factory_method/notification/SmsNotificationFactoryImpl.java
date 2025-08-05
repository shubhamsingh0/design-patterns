package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public class SmsNotificationFactoryImpl implements NotificationFactory<SmsNotificationParams> {
    @Override
    public Notification createNotification(SmsNotificationParams params) {
        return new SmsNotification(
            params.getToPhoneNumber(),
            params.getFromPhoneNumber(),
            params.getMessage()
        );
    }
}
