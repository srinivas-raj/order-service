package com.order.controller;

import com.order.domain.OrderData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public OrderData getOrders(){
        return OrderData.builder().id("123").orderName("i20-laptop-8084").build();
    }
}
