package com.order.service;

import com.order.config.OrderFileConfig;
import com.order.domain.OrderData;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("file")
@RequiredArgsConstructor
public class FileOrderService implements OrderService {

    private final OrderFileConfig orderFileConfig;
    @Override
    public OrderData getOrderDetails(String orderId) {
        return orderFileConfig.getOrders().stream().filter(orderData ->
                orderData.getId().equals(orderId)).findAny().get();
    }
}
