package com.ecom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CommandLineRunner cmdRunner() {
        return (args) -> System.out.println("Application is running on port 9090...");
    }
}
