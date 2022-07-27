package com.abc.service;

import com.abc.Factory.StudentPersistenceFactory;
import com.abc.POJO.Student;
import com.abc.persistence.IStudentPersistence;

public class StudentServiceImpl implements IStudentService
{

	@Override
	public String create(Student student) {
		IStudentPersistence studentPersistence = StudentPersistenceFactory.getStudentPersistence();
		return studentPersistence.create(student);
	}

	@Override
	public Student display(int id) {
		IStudentPersistence studentPersistence = StudentPersistenceFactory.getStudentPersistence();
		return studentPersistence.display(id);
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
