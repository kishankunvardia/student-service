package com.qa.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository <Student, Long>{
	
	

}
