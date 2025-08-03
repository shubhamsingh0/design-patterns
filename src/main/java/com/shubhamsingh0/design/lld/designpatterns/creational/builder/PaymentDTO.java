package com.shubhamsingh0.design.lld.designpatterns.creational.builder;

// End Result or DTO class that will be built by the builder
public class PaymentDTO {
    private String paymentId;
    private String amount;
    private String currency;
    private String paymentMethod;

    // use public getters to access the fields
    public String getPaymentId() {
        return paymentId;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // private setters to ensure that the fields can only be set through the builder
    private void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    private void setAmount(String amount) {
        this.amount = amount;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }

    private void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // static method to return an instance of the builder
    public static PaymentDtoBuilder builder() {
        return new PaymentDtoBuilder();
    }
    // static inner class for the builder pattern
    public static class PaymentDtoBuilder {
        private String paymentId;
        private String amount;
        private String currency;
        private String paymentMethod;

        // returns an instance of the builder
        public PaymentDtoBuilder paymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }
        public PaymentDtoBuilder amount(String amount) {
            this.amount = amount;
            return this;
        }
        public PaymentDtoBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        public PaymentDtoBuilder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        // builds the PaymentDTO object
        public PaymentDTO build() {
            PaymentDTO paymentDTO = new PaymentDTO();
            paymentDTO.setPaymentId(paymentId);
            paymentDTO.setAmount(amount);
            paymentDTO.setCurrency(currency);
            paymentDTO.setPaymentMethod(paymentMethod);
            return paymentDTO;
        }
    }
}
