package com.github.abdennebi;

import com.github.abdennebi.client.ProductClientApi;
import com.github.abdennebi.client.StockClientApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients(clients = {ProductClientApi.class, StockClientApi.class})
public class Frontend {

    public static void main(String[] args) {
        SpringApplication.run(Frontend.class, args);
    }
}
