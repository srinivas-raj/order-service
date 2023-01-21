package com.order.config;

import com.order.domain.OrderData;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "order-data-db")
@Data
@Profile("db")
public class OrderDbConfig {
    List<OrderData> orders=new ArrayList<>();
}
