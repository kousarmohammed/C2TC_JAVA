package com.tns.dao;

import com.tns.entities.student;

public abstract class StudentDao {
	public abstract student getStudentById(int id);
	
	public abstract void addStudent(Student student);
	
	public abstract void removeStudent(Student student);
	
	public abstract void updateStudent(Student student);
	

}
