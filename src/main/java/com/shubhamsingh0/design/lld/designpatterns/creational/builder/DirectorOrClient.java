package com.shubhamsingh0.design.lld.designpatterns.creational.builder;

public class DirectorOrClient {
    public static void main(String[] args) {
        PaymentDTO.PaymentDtoBuilder paymentDtoBuilder = PaymentDTO.builder();
        PaymentDTO dto = paymentDtoBuilder
                .paymentId("12345")
                .amount("100.00")
                .currency("USD")
                .paymentMethod("Credit Card")
                .build();
        System.out.println("Payment ID: " + dto.getPaymentId() +
                           ", Amount: " + dto.getAmount() +
                           ", Currency: " + dto.getCurrency() +
                           ", Payment Method: " + dto.getPaymentMethod());
    }
}
