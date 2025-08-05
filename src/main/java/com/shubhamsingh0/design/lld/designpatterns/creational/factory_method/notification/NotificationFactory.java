package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public interface NotificationFactory<T> {
    Notification createNotification(T params);
}
