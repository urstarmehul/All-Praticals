package com.in28minutes.database.databasedemo;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 102 -> {}",repository.findById(102));
		
		logger.info("\nInserting 104 -> {}",repository.insert(new Person(104, "Rahul", "Mumbai", new Date(0))));
		logger.info("\nUpdating 103 -> {}",repository.update(new Person(103, "Peter", "Patna", new Date(0))));
		repository.deleteById(1);	
		//logger.info("All users -> {}",repository.findAll());
	}

}
