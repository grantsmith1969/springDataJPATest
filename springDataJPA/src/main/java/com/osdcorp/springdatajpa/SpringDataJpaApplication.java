package com.osdcorp.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(ClientRepository clientRepository) {
        return (args -> {
            /*insetClients(clientRepository);
            System.out.println(clientRepository.findAll());*/
            System.out.println(clientRepository.findClientByCompanyNameContaining("a"));
        });
    }

    public void insetClients(ClientRepository clientRepository) {
        clientRepository.save(new Client("OsdCorp"));
        clientRepository.save(new Client("Marathon Management"));
        clientRepository.save(new Client("Marathon Construction"));
        clientRepository.save(new Client("Marathon Telemetry"));

    }
}
