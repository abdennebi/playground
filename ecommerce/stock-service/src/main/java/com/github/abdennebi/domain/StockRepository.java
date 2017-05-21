package com.github.abdennebi.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface StockRepository extends JpaRepository<Stock, Long> {

    Stock findByProductRef(String productRef);
}
