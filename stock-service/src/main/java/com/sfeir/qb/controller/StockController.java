package com.sfeir.qb.controller;

import com.sfeir.qb.domain.Stock;
import com.sfeir.qb.domain.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
@RestController
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @GetMapping("/{productRef}")
    ResponseEntity<Long> getProductRefStock(@PathVariable String productRef) {
        Stock stock = stockRepository.findByProductRef(productRef);
        if (stock!=null) {
            return ResponseEntity.ok().body(stock.getQuantity());
        }
        return ResponseEntity.ok().body(0L);
    }
}
