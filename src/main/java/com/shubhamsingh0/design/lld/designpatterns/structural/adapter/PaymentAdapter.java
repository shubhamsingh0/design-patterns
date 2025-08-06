package com.shubhamsingh0.design.lld.designpatterns.structural.adapter;

// This is the adapter class that implements the target interface and adds the existing class LegacyPaymentProcessor as composition
public class PaymentAdapter implements PaymentGateway {

    private final LegacyPaymentProcessor legacyPaymentProcessor; // Object Adapter Pattern

    public PaymentAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    @Override
    public Boolean performPayment(String paymentType, Double amount) {
        String status = legacyPaymentProcessor.processPayment(paymentType);
        return !status.isBlank();
    }
}
