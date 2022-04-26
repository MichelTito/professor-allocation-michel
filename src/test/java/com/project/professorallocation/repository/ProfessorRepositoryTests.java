package com.project.professorallocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Professor;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")

public class ProfessorRepositoryTests {

	@Autowired
	ProfessorRepository repository;

	@Test
	public void findAll() {
		List<Professor> items = repository.findAll();

		System.out.println("Quantidade elementos retornados: " + items.size());

		for (Professor item : items) {
			System.out.println(item);

		}

	}

	@Test
	public void create() {
		Professor professorBeingCreated = new Professor();
		professorBeingCreated.setName("Michel Titoo");
		professorBeingCreated.setCpf("12345678999");
		professorBeingCreated.setDepartmentId(3L);

		professorBeingCreated = repository.save(professorBeingCreated);
		System.out.println(professorBeingCreated);

	}

	@Test
	public void findSpecificProfessor() {
		Professor prof = repository.findById(3L).orElse(null);

		System.out.println(prof);

	}
}