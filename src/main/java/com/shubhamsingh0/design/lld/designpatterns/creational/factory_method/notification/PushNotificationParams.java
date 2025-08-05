package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PushNotificationParams {
    private String toDeviceToken;
    private String fromDeviceToken;
    private String message;
    private String title;
}

