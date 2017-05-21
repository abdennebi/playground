package com.github.abdennebi.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("stock-service")
public interface StockClientApi {

    @RequestMapping("/stocks/{productRef}")
    ResponseEntity<Long> getProductQuantity(@PathVariable("productRef") String productRef);
}
