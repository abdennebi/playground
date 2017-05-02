package com.sfeir.qb.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Abderrazak BOUADMA
 * on 02/05/2017.
 */
@Transactional
public interface StockRepository extends JpaRepository<Stock,Long> {

    Stock findByProductRef(String productRef);
}
