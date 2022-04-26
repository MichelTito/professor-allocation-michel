package com.project.professorallocation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Allocation;
import com.project.professorallocation.model.Course;


@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")

public class AllocationServiceTests {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");
	
	@Autowired
	AllocationService service;

	private Object repository;
	
	@Test
	public void create() throws ParseException {
		Allocation allocation = new Allocation();
		allocation.setDayOfWeek(DayOfWeek.SUNDAY);
		allocation.setProfessorId(1L);
		allocation.setCourseId(7L);
		allocation.setStartHour(sdf.parse("19:00-0300"));
		allocation.setEndHour(sdf.parse("21:00-0300"));
		
		allocation = service.create(allocation);
		
	}
	    @Test
	    public void update() throws ParseException {
	        Allocation allocation = new Allocation();
	        allocation.setId(1L);
	        allocation.setDayOfWeek(DayOfWeek.MONDAY);
	        allocation.setStartHour(sdf.parse("19:00-0300"));
	        allocation.setEndHour(sdf.parse("20:00-0300"));
	        allocation.setProfessorId(1L);
	        allocation.setCourseId(1L);
	        
	        allocation = service.update(allocation);

	        System.out.println(allocation);
	    }
	
	}
