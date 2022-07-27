package com.abc.controller;

import com.abc.Factory.StudentServiceFactory;
import com.abc.POJO.Student;
import com.abc.service.IStudentService;

public class StudentControllerImpl implements IStudentController
{

	@Override
	public String create(Student student) {
		IStudentService studentService = StudentServiceFactory.getStudentService();		 
		return studentService.create(student);
	}

	@Override
	public Student display(int id) {
		IStudentService studentService = StudentServiceFactory.getStudentService();
		return studentService.display(id);
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
