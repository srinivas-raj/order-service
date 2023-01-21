package com.order.service;

import com.order.config.OrderDbConfig;
import com.order.domain.OrderData;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@Profile("db")
public class DbOrderService implements OrderService {
    private final OrderDbConfig orderDbConfig;

    @Override
    public OrderData getOrderDetails(String orderId) {
        return orderDbConfig.getOrders().stream().filter(orderData ->
                orderData.getId().equals(orderId)).findAny().get();
    }
}
