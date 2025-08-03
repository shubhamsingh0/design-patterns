package com.shubhamsingh0.design.lld.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacyProcessor = new LegacyPaymentProcessor();
        PaymentGateway paymentGateway = new PaymentAdapter(legacyProcessor);

        Boolean paymentStatus = paymentGateway.performPayment("UPI", 1000.0);
        System.out.println("Payment status: " + (paymentStatus ? "Success" : "Failure"));
    }
}
