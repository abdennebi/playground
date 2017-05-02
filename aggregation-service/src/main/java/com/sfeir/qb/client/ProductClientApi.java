package com.sfeir.qb.client;

import com.sfeir.qb.service.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
@FeignClient("product-service")
public interface ProductClientApi {

    @RequestMapping("/products")
    ResponseEntity<List<Product>> findAllProduct();
}
