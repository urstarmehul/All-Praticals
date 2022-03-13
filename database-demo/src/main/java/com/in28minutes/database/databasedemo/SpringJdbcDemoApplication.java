package com.in28minutes.database.databasedemo;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}",dao.findAll());
		logger.info("\nUser id 102 -> {}",dao.findById(102));
		logger.info("\nDeleting 101 -> No. of Rows Deleted - {}",dao.deleteById(101));
		logger.info("\nInserting 104 -> {}",dao.insert(new Person(104, "Rahul", "Mumbai", new Date(0))));
		logger.info("\nUpdating 103 -> {}",dao.update(new Person(103, "Peter", "Patna", new Date(0))));
		
	}

}
