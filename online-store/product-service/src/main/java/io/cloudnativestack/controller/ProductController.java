package io.cloudnativestack.controller;

import io.cloudnativestack.domain.Product;
import io.cloudnativestack.domain.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

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
        Product product = productRepository.getOne(id);
        return ResponseEntity.ok().body(product);
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
