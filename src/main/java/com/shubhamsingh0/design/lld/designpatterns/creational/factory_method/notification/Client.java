package com.shubhamsingh0.design.lld.designpatterns.creational.factory_method.notification;

public class Client {
    public static void main(String[] args) {
        // Email Notification
        EmailNotificationParams emailParams = new EmailNotificationParams(
                "to@gmail.com",
                "from@gmail.com",
                "Subject",
                "Body of the email"
        );
        NotificationFactory<EmailNotificationParams> emailFactory = new EmailNotificationFactoryImpl();
        Notification emailNotification = emailFactory.createNotification(emailParams);
        emailNotification.sendNotification(emailParams.getBody());
        emailNotification.sendNotification();

        // SMS Notification
        SmsNotificationParams smsParams = new SmsNotificationParams(
                "1234567890",
                "0987654321",
                "This is a test SMS notification."
        );
        NotificationFactory<SmsNotificationParams> smsFactory = new SmsNotificationFactoryImpl();
        Notification smsNotification = smsFactory.createNotification(smsParams);
        smsNotification.sendNotification(smsParams.getMessage());

        // Push Notification
        PushNotificationParams pushParams = new PushNotificationParams(
                "toDeviceToken",
                "fromDeviceToken",
                "This is a test Push notification.",
                "Test Push Notification"
        );
        NotificationFactory<PushNotificationParams> pushFactory = new PushNotificationFactoryImpl();
        Notification pushNotification = pushFactory.createNotification(pushParams);
        pushNotification.sendNotification(pushParams.getMessage());

        // OR

        // Using NotificationService to send notifications
        NotificationService<EmailNotificationParams> emailService = new NotificationService<>(new EmailNotificationFactoryImpl());
        emailService.notifyUsers(emailParams, emailParams.getBody());


        NotificationService<SmsNotificationParams> smsService = new NotificationService<>(new SmsNotificationFactoryImpl());
        smsService.notifyUsers(smsParams, smsParams.getMessage());


        NotificationService<PushNotificationParams> pushService = new NotificationService<>(new PushNotificationFactoryImpl());
        pushService.notifyUsers(pushParams, pushParams.getMessage());
    }


}
