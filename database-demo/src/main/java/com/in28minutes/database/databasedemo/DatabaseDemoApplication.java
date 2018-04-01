package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDAO dao;

    public static void main(final String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        this.logger.info("All users -> {}", this.dao.findAll());
        this.logger.info("User id 10001 -> {}", this.dao.findById(10001));
        this.logger.info("User location New York -> {}", this.dao.findByLocation("New York"));
        this.logger.info("Deleting 10002 -> {}", this.dao.deleteById(10002));
        this.logger.info("Inserting 10005 -> {}", this.dao.insert(new Person(10005, "Tara", "Berlin", new Date())));
        this.logger.info("Updating 10003 -> {}", this.dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
    }
}
