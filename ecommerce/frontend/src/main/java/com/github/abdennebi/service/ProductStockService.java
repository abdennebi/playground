package com.github.abdennebi.service;

import com.google.common.collect.Lists;
import com.github.abdennebi.client.ProductClientApi;
import com.github.abdennebi.client.StockClientApi;
import com.github.abdennebi.domain.ProductWithStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductStockService {

    @Autowired
    ProductClientApi productClientApi;

    @Autowired
    StockClientApi stockClientApi;

    public List<ProductWithStock> findAllProductsWithStock() {
        ResponseEntity<List<Product>> productApiResponse = productClientApi.findAllProduct();
        if (productApiResponse.getStatusCode().is2xxSuccessful()) {
            List<Product> products = productApiResponse.getBody();
            List<ProductWithStock> result = Lists.newArrayList();
            products.forEach(p -> result.add(buildProductStockView(p)));
            return result;
        }
        return Lists.newArrayList();
    }

    private ProductWithStock buildProductStockView(Product product) {
        ProductWithStock productWithStock = ProductWithStock.builder()
                .productRef(product.getRef())
                .productTitle(product.getTitle())
                .productDescription(product.getDescription())
                .build();

        ResponseEntity<Long> productQuantityResponse = stockClientApi.getProductQuantity(product.getRef());

        if (productQuantityResponse.getStatusCode().is2xxSuccessful()) {
            productWithStock.setQuantity(productQuantityResponse.getBody());
        } else if (productQuantityResponse.getStatusCode().is4xxClientError()) {
            productWithStock.setQuantity(0L);
        }

        return productWithStock;
    }
}
