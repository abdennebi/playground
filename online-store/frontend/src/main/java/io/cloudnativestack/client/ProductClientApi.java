package io.cloudnativestack.client;

import io.cloudnativestack.service.Product;
import feign.RequestLine;

import java.util.List;

public interface ProductClientApi {

    @RequestLine("GET /products")
    List<Product> findAllProduct();
}
