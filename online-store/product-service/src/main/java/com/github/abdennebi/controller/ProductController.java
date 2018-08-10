package com.github.abdennebi.controller;

import com.github.abdennebi.domain.Product;
import com.github.abdennebi.domain.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok().body(productRepository.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id) {
        Product example = new Product();
        example.setId(id);
        Optional<Product> result = productRepository.findOne(Example.of(example));

        return ResponseEntity.ok().body(result.get());
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
        return ResponseEntity.created(new URI("/" + savedProduct.getId())).body(savedProduct);
    }
}
