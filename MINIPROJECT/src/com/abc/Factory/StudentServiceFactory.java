package com.abc.Factory;

import com.abc.service.IStudentService;
import com.abc.service.StudentServiceImpl;

public class StudentServiceFactory
{
	private static IStudentService studentService;
	
	static
	{
		studentService=new StudentServiceImpl();
	}
	
	public static IStudentService getStudentService()
	{
		return studentService;
	}

}
