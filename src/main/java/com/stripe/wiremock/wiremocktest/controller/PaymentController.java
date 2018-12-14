package com.stripe.wiremock.wiremocktest.controller;

import com.stripe.wiremock.wiremocktest.model.Charge;
import com.stripe.wiremock.wiremocktest.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    private static final String STRIPE_END_POINT = "https://api.stripe.com/v1/charges/";

    @PostMapping(value="/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Charge create(@RequestBody Charge charge) {

        //return this.paymentService.create(charge);
        RestTemplate restTemplate1 = new RestTemplate();
        restTemplate1.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate1.postForObject(STRIPE_END_POINT, charge, Charge.class);
    }

}