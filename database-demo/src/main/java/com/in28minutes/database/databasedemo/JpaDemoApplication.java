package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.PersonJpa;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(final String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        logger.info("All users -> {}", repository.findAll());
        logger.info("User id 10001 -> {}", repository.findById(10001));
        // this.logger.info("User location New York -> {}", this.dao.findByLocation("New
        // York"));
        repository.deleteById(10002);
        logger.info("Inserting -> {}", repository.insert(new PersonJpa("Tara", "Berlin", new Date())));
        logger.info("Updating 10003 -> {}", repository.update(new PersonJpa(10003, "Pieter", "Utrecht", new Date())));
    }
}
