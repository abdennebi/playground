package com.github.abdennebi;

import com.github.abdennebi.domain.Product;
import com.github.abdennebi.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackageClasses = {com.github.abdennebi.domain.ProductRepository.class})
public class ProductServiceApplication {

    @Autowired
    ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
    CommandLineRunner dataInit() {
	    return args -> {
            Product p = new Product();
            p.setRef("REF001");
            p.setTitle("Mac Book Pro 15");
            p.setDescription("Apple Mac Book Pro");
            productRepository.save(p);

            p = new Product();
            p.setRef("REF002");
            p.setTitle("Mac Book Pro 13");
            p.setDescription("Apple Mac Book Pro");
            productRepository.save(p);

            p = new Product();
            p.setRef("REF003");
            p.setTitle("IPhone 7");
            p.setDescription("Apple IPhone 7 5");
            productRepository.save(p);

            p = new Product();
            p.setRef("REF004");
            p.setTitle("SSD 512Gb");
            p.setDescription("Intel SSD Hard drive");
            productRepository.save(p);

            p = new Product();
            p.setRef("REF005");
            p.setTitle("iiyama 24 inches ips monitor");
            p.setDescription("High quality PC Monitor");
            productRepository.save(p);

            p = new Product();
            p.setRef("REF006");
            p.setTitle("WASD quwerty keyboard");
            p.setDescription("Professional Developer Keyboard");
            productRepository.save(p);
        };
    }
}
