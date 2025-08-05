package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public class PushNotificationFactoryImpl implements NotificationFactory<PushNotificationParams> {
    @Override
    public Notification createNotification(PushNotificationParams params) {
        return new PushNotification(
            params.getToDeviceToken(),
            params.getFromDeviceToken(),
            params.getMessage(),
            params.getTitle()
        );
    }
}
