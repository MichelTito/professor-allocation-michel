package com.project.professorallocation.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Course;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class CourseServiceTests {
	
	@Autowired
	private CourseService service;
	
	@Test
	public void create () {
		Course course = new Course();
		course.setName("Curso de Matemática");
		
		course = service.create(course);
	
	}
	
	public void update() {
		Course course = new Course();
		course.setId(2L);
		course.setName("Curso de Subtração");
		
		course = service.update(course);
		
	}
	
	public void findSpecificCourse() {
		
		Course dept = service.findById(3L);
				
		System.out.println(dept);
		
				
	}

}
