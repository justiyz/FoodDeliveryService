package com.servbytefooddelivery.service.payments.paystack;

import lombok.Data;

@Data
public class Authorization {
    private String authorization_code;
    private String card_type;
    private String last4;
    private String exp_month;
    private String exp_year;
    private String bin;
    private String bank;
    private String channel;
    private String signature;
    private Boolean reusable;
    private String country_code;
    private String account_name;
}
