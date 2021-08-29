package com.anil.mvcproject.mvcjpathymeleaf.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.mvcproject.mvcjpathymeleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID>{
	
}
