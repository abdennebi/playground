package com.sfeir.qb.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 01/05/2017.
 */
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByRef(String ref);

}
