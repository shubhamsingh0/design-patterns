package com.shubhamsingh0.design.lld.designpatterns.structural.facade;

public interface EmailFacade {
    String sendEmail(String recipientEmail, String subject, String body);
    String checkEmailStatus(String emailId);
}
