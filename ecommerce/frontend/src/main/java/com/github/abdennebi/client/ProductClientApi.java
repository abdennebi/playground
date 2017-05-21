package com.github.abdennebi.client;

import com.github.abdennebi.service.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("product-service")
public interface ProductClientApi {

    @RequestMapping("/products")
    ResponseEntity<List<Product>> findAllProduct();
}
