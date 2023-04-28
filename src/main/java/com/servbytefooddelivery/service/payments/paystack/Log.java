package com.servbytefooddelivery.service.payments.paystack;

import lombok.Data;

import java.util.List;

@Data
public class Log {
    private Integer time_spent;
    private Integer attempts;
    private String authentication;
    private Integer errors;
    private String success;
    private String mobile;
    private List<String> input;
    private String channel;
}
