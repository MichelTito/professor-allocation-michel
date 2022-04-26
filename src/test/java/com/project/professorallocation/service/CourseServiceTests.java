package com.project.professorallocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Course;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class CourseServiceTests {
	
	@Autowired
	private CourseService service;
	
	@test
	public void create () {
		Course course = new Course();
		course.setName("Curso de Matemática");
		
		course = service.create(course);
	
	}
	
	

}
