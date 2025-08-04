package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

// This is the refined abstraction for payment methods.
public class CardPayment implements PaymentMethod {
    private final PaymentGateway paymentGateway;

    public CardPayment(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String sourceAccount, String destinationAccount, double amount) {
        System.out.println(paymentGateway.checkBalance(sourceAccount,amount));
        System.out.println(paymentGateway.checkReceiverDetails(destinationAccount));
        String transactionId = paymentGateway.initiatePayment(sourceAccount, destinationAccount, amount);
        System.out.println(transactionId);
        System.out.println(paymentGateway.confirmPayment(transactionId));
    }
}
