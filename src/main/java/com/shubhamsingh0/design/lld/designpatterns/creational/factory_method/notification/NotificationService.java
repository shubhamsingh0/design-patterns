package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public class NotificationService<T> {
    private final NotificationFactory<T> notificationFactory;

    public NotificationService(NotificationFactory<T> notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void notifyUsers(T params, String message) {
        Notification notification = notificationFactory.createNotification(params);
        notification.sendNotification(message);
    }
}
