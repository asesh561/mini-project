package com.abc.Factory;

import com.abc.controller.IStudentController;
import com.abc.controller.StudentControllerImpl;

public class StudentControllerFactory 
{
	private static IStudentController studentcontroller;
	
	static
	{
		studentcontroller=new StudentControllerImpl();
	}
	public static IStudentController getStudentController()
	{
		return studentcontroller;
	}

}
