package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

public class HdfcCreditCard implements PaymentGateway {
    @Override
    public String checkBalance(String accountNumber, double amount) {
        // Logic to check balance in HDFC credit card account
        return "Balance checked for HDFC Credit Card Account: " + accountNumber;
    }

    @Override
    public String checkReceiverDetails(String accountNumber) {
        // Logic to check receiver details for HDFC credit card account
        return "Receiver details checked for HDFC Credit Card Account: " + accountNumber;
    }

    @Override
    public String initiatePayment(String sourceAccount, String destinationAccount, double amount) {
        // Logic to initiate payment using HDFC credit card
        return "Payment initiated from HDFC Credit Card Account: " + sourceAccount + " to " + destinationAccount + " of amount: " + amount;
    }

    @Override
    public String confirmPayment(String transactionId) {
        // Logic to confirm payment for HDFC credit card transaction
        return "Payment confirmed for transaction ID: " + transactionId;
    }
}
