package com.shubhamsingh0.design.lld.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
//        The adapter pattern solves the problem of incompatible interfaces between classes.
//        It allows objects with different interfaces to work together by providing a
//        wrapper (adapter) that translates one interface into another expected by the client.
//        This is useful when integrating legacy code or third-party libraries without modifying
//        their source code.
//        Example: Adapting a legacy payment processor to a modern payment gateway interface

        LegacyPaymentProcessor legacyProcessor = new LegacyPaymentProcessor(); // Legacy system with a different interface
        PaymentGateway paymentGateway = new PaymentAdapter(legacyProcessor);   // Adapter that converts the legacy interface to the new one

        Boolean paymentStatus = paymentGateway.performPayment("UPI", 1000.0);
        System.out.println("Payment status: " + (paymentStatus ? "Success" : "Failure"));
    }
}
