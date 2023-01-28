package com.tns.service;

import com.tns.dao.Student;

public interface StudentService {
		public abstract void addStudent(Student student);
		public abstract void updateStuent(Student student);
		public abstract void removeStudent(Student student);
		public abstract Student findStudentById(int id);
		public abstract void updateStudent(Student student);
		public abstract void addStudent(com.tns.client.Student student);
		
		

	}

	


