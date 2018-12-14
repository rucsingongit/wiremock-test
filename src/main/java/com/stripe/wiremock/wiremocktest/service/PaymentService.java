package com.stripe.wiremock.wiremocktest.service;


import com.stripe.wiremock.wiremocktest.model.Charge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    /*@Value("${stripe.endpoint.create}")
    private String stripeEndPoint;*/

    private static final String STRIPE_END_POINT = "https://api.stripe.com/v1/charges/";

    public Charge create(Charge charge) {


        RestTemplate restTemplate1 = new RestTemplate();
        return restTemplate1.postForObject(STRIPE_END_POINT, charge, Charge.class);

    }
}
