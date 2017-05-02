package com.sfeir.qb.controller;

import com.sfeir.qb.domain.ProductWithStock;
import com.sfeir.qb.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
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
