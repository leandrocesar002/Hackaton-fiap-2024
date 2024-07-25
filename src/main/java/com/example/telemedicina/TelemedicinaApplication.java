package com.example.telemedicina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.telemedicina.adapter.out.persistence")
@EntityScan(basePackages = "com.example.telemedicina.domain")
public class TelemedicinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelemedicinaApplication.class, args);
    }
}
