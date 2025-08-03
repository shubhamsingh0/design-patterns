package com.shubhamsingh0.design.lld.designpatterns.structural.adapter;
// This is the target interface that the client expects to use
public interface PaymentGateway {
    Boolean performPayment(String paymentType, Double amount);
}
