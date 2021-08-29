package com.anil.mvcproject.mvcjpathymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.mvcproject.mvcjpathymeleaf.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
