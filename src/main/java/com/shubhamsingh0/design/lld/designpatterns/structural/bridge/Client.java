package com.shubhamsingh0.design.lld.designpatterns.structural.bridge;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        // Bridge pattern makes the abstraction and implementation independent.
        // Implementor can contain methods as steps or set of operation, to achieve the desired functionality by Abstraction

//        The bridge pattern solves the problem of coupling an abstraction to its implementation,
//        allowing them to vary independently. It is useful when you want to avoid a permanent binding
//        between an abstraction and its implementation, enabling flexibility and scalability in code by
//        separating concerns and reducing class explosion caused by inheritance.
//        Example: Payment processing system where different payment methods can be implemented independently
//        and can be extended without modifying the existing code.

        PaymentMethod paymentMethod = new CardPayment(new HdfcCreditCard());
        paymentMethod.makePayment(UUID.randomUUID().toString(), UUID.randomUUID().toString(), 2000.0);
    }
}
