package com.mehul.jpa.hibernate.demohibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mehul.jpa.hibernate.demohibernate.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;

	@Test
	public void findById_basic() {
		Course course = repository.findById(1001L);
		assertEquals("working with JPA", course.getName());
		//logger.info("Testing is Running");
	}

}
