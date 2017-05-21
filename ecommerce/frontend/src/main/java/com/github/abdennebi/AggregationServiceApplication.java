package com.github.abdennebi;

import com.github.abdennebi.client.ProductClientApi;
import com.github.abdennebi.client.StockClientApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {ProductClientApi.class, StockClientApi.class})
public class AggregationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregationServiceApplication.class, args);
	}
}
