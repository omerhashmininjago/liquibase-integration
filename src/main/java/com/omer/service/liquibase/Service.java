package com.omer.service.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.omer.service.liquibase.domain")
@EnableJpaRepositories(basePackages = "com.omer.service.liquibase.jpa.repo")
@EnableJdbcRepositories(basePackages = "com.omer.service.liquibase.jdbc.dao")
public class Service {

    public static void main(String[] args) {
        SpringApplication.run(Service.class, args);
    }
}
