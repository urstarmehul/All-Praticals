package com.in28minutes.database.databasehibernate;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasehibernate.entity.Person;
import com.in28minutes.database.databasehibernate.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class DatabaseHibernateApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseHibernateApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}",dao.findAll());
		logger.info("\nUser Id 101 is -> {}",dao.findById(101));
		logger.info("\nDeleting Id 102 -> No.of Rows Deleted - {}", dao.deleteById(102));
		logger.info("\nInserting 103 -> {}",dao.insert(new Person(103, "Rahul", "Mumbai", new Date(0))));
		logger.info("\nUpdating 101 -> {}",dao.update(new Person(101, "Peter", "Chennai", new Date(0))));	
	}

}
