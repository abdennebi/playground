package com.github.abdennebi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class Frontend {

    public static void main(String[] args) {
        SpringApplication.run(Frontend.class, args);
    }
}
