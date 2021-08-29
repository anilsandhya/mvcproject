package com.anil.mvcproject.mvcjpathymeleaf.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.anil.mvcproject.mvcjpathymeleaf.entity.Student;
import com.anil.mvcproject.mvcjpathymeleaf.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository repository;
	
	@Autowired
	public StudentService(final StudentRepository respository) {
		this.repository = respository;
	}
	
	public Page<Student> getStudents(final int pageNumber, final int size){
		return repository.findAll(PageRequest.of(pageNumber, size));
	}
	
	public Optional<Student> getStudent(final UUID id){
		return repository.findById(id);
	}
	
	public Student save(final Student student) {
		return repository.save(student);
	}
	
	public void delete(final UUID id) {
		repository.deleteById(id);
	}
}
