package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

public class PhonePeUpi implements PaymentGateway {

    @Override
    public String checkBalance(String accountNumber, double amount) {
        // Logic to check balance in PhonePe UPI account
        return "Balance checked for account: " + accountNumber;
    }

    @Override
    public String checkReceiverDetails(String accountNumber) {
        // Logic to check receiver details in PhonePe UPI
        return "Receiver details checked for account: " + accountNumber;
    }

    @Override
    public String initiatePayment(String sourceAccount, String destinationAccount, double amount) {
        // Logic to initiate payment using PhonePe UPI
        return "Payment initiated from " + sourceAccount + " to " + destinationAccount + " of amount: " + amount;
    }

    @Override
    public String confirmPayment(String transactionId) {
        // Logic to confirm payment in PhonePe UPI
        return "Payment confirmed for transaction ID: " + transactionId;
    }
}
