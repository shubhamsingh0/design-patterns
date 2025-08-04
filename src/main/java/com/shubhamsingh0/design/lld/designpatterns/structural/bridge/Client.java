package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        // Bridge pattern makes the abstraction and implementation independent.
        // Implementor can contain methods as steps or set of operation, to achieve the desired functionality by Abstraction
        PaymentMethod paymentMethod = new CardPayment(new HdfcCreditCard());
        paymentMethod.makePayment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), 2000.0);
    }
}
