package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsNotificationParams {
    private String toPhoneNumber;
    private String fromPhoneNumber;
    private String message;
}

