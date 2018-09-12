package io.cloudnativestack.config;

import io.cloudnativestack.client.ProductClientApi;
import io.cloudnativestack.client.StockClientApi;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Value("${frontend.product.url}")
    String productUrl;

    @Value("${frontend.stock.url}")
    String stockUrl;

    @Bean
    public ProductClientApi productClientApi() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(ProductClientApi.class, productUrl);
    }

    @Bean
    public StockClientApi stockClientApi() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(StockClientApi.class, stockUrl);
    }
}
