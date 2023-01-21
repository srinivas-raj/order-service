package com.order.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderData {
    private String id;
    private String orderName;
    private BigDecimal price;
}
