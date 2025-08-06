package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

// This is the PaymentMethod interface that defines the abstraction for payment methods.
// Its implementations will have reference of Implementor.
public interface PaymentMethod {
    void makePayment(String sourceAccount, String destinationAccount, double amount);
}
