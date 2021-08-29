package com.anil.mvcproject.mvcjpathymeleaf;

import static java.util.UUID.randomUUID;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.anil.mvcproject.mvcjpathymeleaf.entity.Student;
import com.anil.mvcproject.mvcjpathymeleaf.repository.StudentRepository;

@SpringBootApplication
@EnableWebSecurity
public class SpringbootBackend231Application {

	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend231Application.class, args);
		
	}
	
	@Bean
	public ApplicationRunner initializeStudents() {
		final Student defaultStudent1 = new Student(randomUUID(), "John", "Doe");
		final Student defaultStudent2 = new Student(randomUUID(), "Linda", "Rostam");
		final Student defaultStudent3 = new Student(randomUUID(), "Tom", "Cruise");
		
		return args -> studentRepository.saveAll(Arrays.asList(defaultStudent1, defaultStudent2, defaultStudent3));
	}

}