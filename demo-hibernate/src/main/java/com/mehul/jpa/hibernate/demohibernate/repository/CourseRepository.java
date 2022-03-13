package com.mehul.jpa.hibernate.demohibernate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mehul.jpa.hibernate.demohibernate.entity.Course;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager em;
	
	public Course findById(Long id)
	{
		return em.find(Course.class, id);
	}
	
	public Course save(Course course) {
		if(course.getId()==null) {
			//insert
			em.persist(course);
		}
		else {
			//update
			em.merge(course);
		}
	return course;
	}
	
	public void deleteById(Long id) {
		Course course = findById(id);
		em.remove(course);
	}
	
	public void playWithEntityManager() {
		Course course1 = new Course("Web Service in 100 steps");
		em.persist(course1);
		Course course2 = new Course("Angular JS in 100 steps");
		em.persist(course2);
		
		em.flush();
		//em.clear();
		
		course1.setName("Web Service in 100 steps - Updated");
		course2.setName("Angular JS in 100 steps - Updated");
		
		em.refresh(course1);
		em.flush();
		
		//course2.setName("Angular JS in 100 steps - Updated");
		//em.flush();	
	}  
}
