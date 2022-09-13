package com.qa.student.service;

import java.util.List;

import com.qa.student.entity.Student;

public interface IStudentService {
	
	//CRUD operations
		public Student saveStudent(Student student);
		public List<Student> getAllStudents();
		public Student getStudentById(long id);
		public Student updateStudent(Student student);
		public boolean deleteStudent(long id);

}
