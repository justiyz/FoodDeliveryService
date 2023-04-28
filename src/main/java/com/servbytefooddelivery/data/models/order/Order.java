package com.servbytefooddelivery.data.models.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String orderNumber;

    @OneToMany
    private List<OrderItem> orderItems;
    private BigDecimal totalCost;
    private String reference;
    private String createdDate;
    private String modifiedDate;
}
