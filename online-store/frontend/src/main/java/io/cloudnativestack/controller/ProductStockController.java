package io.cloudnativestack.controller;

import io.cloudnativestack.domain.ProductWithStock;
import io.cloudnativestack.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ProductStockController {

    @Autowired
    ProductStockService service;

    @GetMapping("/products")
    ResponseEntity<List<ProductWithStock>> findAllProductAndStock() {
        return ResponseEntity.ok().body(service.findAllProductsWithStock());
    }
}
