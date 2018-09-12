package io.cloudnativestack.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByRef(String ref);

}
