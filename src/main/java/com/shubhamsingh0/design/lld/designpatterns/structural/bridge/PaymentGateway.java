package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

public interface PaymentGateway {
    String checkBalance(String accountNumber, double amount);
    String checkReceiverDetails(String accountNumber);
    String initiatePayment(String sourceAccount, String destinationAccount, double amount);
    String confirmPayment(String transactionId);
}
