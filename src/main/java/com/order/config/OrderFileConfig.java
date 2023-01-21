package com.order.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.order.domain.OrderData;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Data
@Profile("file")
public class OrderFileConfig {

    List<OrderData> orders = new ArrayList<>();

    @PostConstruct
    public void readFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
         orders = mapper.readValue(new ClassPathResource("./static/order-data.json").getFile(),
                new TypeReference<>() {
                });
    }
}
