package com.abc.Factory;

import com.abc.persistence.IStudentPersistence;
import com.abc.persistence.StudentPersistenceImple;

public class StudentPersistenceFactory 
{
	private static IStudentPersistence studentPersistence;
	
	static
	{
		studentPersistence=new StudentPersistenceImple();
	}
	public static IStudentPersistence getStudentPersistence()
	{
		return studentPersistence;
	}

}
