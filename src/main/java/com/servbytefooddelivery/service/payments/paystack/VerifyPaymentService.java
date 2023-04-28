package com.servbytefooddelivery.service.payments.paystack;

import com.google.gson.Gson;
import com.servbytefooddelivery.service.payments.PaymentVerificationResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Slf4j
@Component
@Service
public class VerifyPaymentService {

    @Value("${secretKey}")
    public String secretKey;


    public PaymentVerificationResponse paymentVerification(String paymentRef) throws Exception {

        PaymentVerificationResponse paymentResponse;
        HttpClient client = HttpClientBuilder.create().build();
        try {

            HttpGet newRequest = new HttpGet("https://api.paystack.co/transaction/verify/" + paymentRef);
            newRequest.addHeader("Content-type", "application/json");
            newRequest.addHeader("Authorization", "Bearer " + secretKey);
            newRequest.addHeader("Cache-Control", "no-cache");
            HttpResponse newResponse = client.execute(newRequest);
            HttpEntity entity = newResponse.getEntity();
            StringBuffer jb = new StringBuffer();
            String line = null;
            if (entity != null) {
                try {
                    BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent()));
                    while ((line = rd.readLine()) != null)
                        jb.append(line);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new Exception("Error Occurred while connecting to paystack url");
            }
            Gson g = new Gson(); //Instantiating the gson class
            paymentResponse = g.fromJson(jb.toString(), PaymentVerificationResponse.class);

            if (paymentResponse == null || paymentResponse.getStatus().equals("false")) { //Check if payment was successful
                throw new Exception("An error occurred while verifying payment");
            } else if (paymentResponse.getData().getStatus().equals("success")) {
                try {
                    if (!paymentResponse.getStatus().equals("true")) {
                        throw new Exception("There was an error somewhere");
                    } else {
                        //Transaction was successful if you got here.....!!!
                    }
                } catch (Exception xcp) {
                    throw new RuntimeException(xcp);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return paymentResponse;
    }


}





















