package com.sfeir.qb.controller;

import com.sfeir.qb.domain.Product;
import com.sfeir.qb.domain.ProductRepository;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 01/05/2017.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository ;

    @GetMapping
    ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok().body(productRepository.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(productRepository.findOne(id));
    }

    @GetMapping("/ref/{ref}")
    ResponseEntity<List<Product>> findProductsByRef(@PathVariable String ref) {
        return ResponseEntity.ok().body(productRepository.findByRef(ref));
    }

    @PostMapping
    ResponseEntity<Product> create(String ref, String title, String description) throws URISyntaxException {
        Product product = new Product();
        product.setRef(ref);
        product.setTitle(title);
        product.setDescription(description);
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.created(new URI("/"+savedProduct.getId())).body(savedProduct);
    }
}
