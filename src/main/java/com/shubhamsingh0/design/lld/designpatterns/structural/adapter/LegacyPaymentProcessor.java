package com.shubhamsingh0.design.lld.designpatterns.structural.adapter;

// This is adaptee/legacy/existing class that needs to be adapted to the target interface
public class LegacyPaymentProcessor {

    public String processPayment(String paymentType) {
        if(paymentType.equalsIgnoreCase("UPI")) {
            return "Processing UPI payment using LegacyPaymentProcessor";
        } else if(paymentType.equalsIgnoreCase("CREDIT_CARD")) {
            return "Processing Credit Card payment using LegacyPaymentProcessor";
        } else {
            return "Unsupported payment type in LegacyPaymentProcessor";
        }
    }
}
