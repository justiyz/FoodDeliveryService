package com.servbytefooddelivery.service.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.servbytefooddelivery.service.payments.paystack.Log;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentVerificationResponse {
    private String status;
    private String message;
    private com.servbytefooddelivery.service.payments.paystack.Data data;
    private Log log;

}
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
//@AllArgsConstructor
//@NoArgsConstructor
//@lombok.Data
//class Data {
//
//    private BigDecimal amount;
//    private String currency;
//    private String transaction_date;
//    public String status;
//    private String reference;
//    private String domain;
//    private Integer metadata;
//    private String gateway_response;
//    private String message;
//    private String channel;
//    private String ip_address;
//    private Log log;
//    private String fees;
//    private Authorization authorization;
//    private Customer Customer;
//    private String plan;
//    private BigDecimal requested_amount;
//}
//@lombok.Data
//class Log{
//    private Integer time_spent;
//    private Integer attempts;
//    private String authentication;
//    private Integer errors;
//    private String success;
//    private String mobile;
//    private List<String> input;
//    private String channel;
//}
//
//@lombok.Data
//class History{
//    private String input;
//    private String message;
//    private Integer time;
//}
//@lombok.Data
//class Authorization{
//    private String authorization_code;
//    private String card_type;
//    private String last4;
//    private String exp_month;
//    private String exp_year;
//    private String bin;
//    private String bank;
//    private String channel;
//    private String signature;
//    private Boolean reusable;
//    private String country_code;
//    private String account_name;
//}
//@lombok.Data
//class Customer{
//    private String id;
//    private String customer_code;
//    private String first_name;
//    private String last_name;
//    private String email;
//
//}
