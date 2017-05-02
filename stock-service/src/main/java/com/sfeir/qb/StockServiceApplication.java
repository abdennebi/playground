package com.sfeir.qb;

import com.sfeir.qb.domain.Stock;
import com.sfeir.qb.domain.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackageClasses = {StockRepository.class})
public class StockServiceApplication {

    @Autowired
    StockRepository stockRepository;

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}

	@Bean
    CommandLineRunner initStockFixtures() {
	    return args -> {
            Stock stock = new Stock();
            stock.setProductRef("REF001");
            stock.setQuantity(100L);
            stockRepository.save(stock);

            stock = new Stock();
            stock.setProductRef("REF002");
            stock.setQuantity(21L);
            stockRepository.save(stock);

            stock = new Stock();
            stock.setProductRef("REF003");
            stock.setQuantity(0L);
            stockRepository.save(stock);
        };
    }
}
