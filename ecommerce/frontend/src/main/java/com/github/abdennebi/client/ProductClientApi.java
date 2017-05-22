package com.github.abdennebi.client;

import com.github.abdennebi.service.Product;
import feign.RequestLine;

import java.util.List;

public interface ProductClientApi {

    @RequestLine("GET /products")
    List<Product> findAllProduct();
}
