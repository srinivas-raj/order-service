package com.order.service;

import com.order.domain.OrderData;

public interface OrderService {
    OrderData getOrderDetails(String orderId);
}
