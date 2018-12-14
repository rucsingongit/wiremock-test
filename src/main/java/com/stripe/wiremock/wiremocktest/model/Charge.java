package com.stripe.wiremock.wiremocktest.model;

public class Charge {


    private Double amount;

    private String currency;


    private String customerEmail;

    private String description;

    private String paymentSource;

    public Charge() {
    }

    public Charge(Double amount, String currency, String customerEmail, String description, String paymentSource) {
        this.amount = amount;
        this.currency = currency;
        this.customerEmail = customerEmail;
        this.description = description;
        this.paymentSource = paymentSource;
    }


}
