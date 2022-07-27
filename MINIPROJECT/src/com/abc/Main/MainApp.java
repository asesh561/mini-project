package com.abc.Main;

import java.util.Scanner;

import com.abc.Factory.StudentControllerFactory;
import com.abc.POJO.Student;
import com.abc.controller.IStudentController;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String sid=null,sname=null,sage=null,saddress=null;
		IStudentController studentController;
		Student s;
		while(true)
		{
			System.out.println("Welcome to our Student Application");
			System.out.println("press 1.Create a student record");
			System.out.println("press 2.View a student record");
			System.out.println("press 3.update a student record");
			System.out.println("press 4. Delete a student record");
			System.out.println("Press 5. Exit");
			System.out.println("Enter your choice: ");
			int option = scan.nextInt();
			switch(option)
			{
			case 1://collecting input for student record from user
				System.out.println("Enter the SID");
				sid=scan.next();
				System.out.println("Enter the STUDENT NAME");
				sname=scan.next();
				System.out.println("Enter the STUDENT AGE");
				sage=scan.next();
				System.out.println("Enter the Student Address");
				saddress=scan.next();
				//create a student object and set the values of object with user input
				s=new Student();
				s.setSid(Integer.parseInt(sid));
				s.setSname(sname);
				s.setSage(Integer.parseInt(sage));
				s.setSaddress(saddress);
				//sending the Student object to controller
				studentController=StudentControllerFactory.getStudentController();
				String status = studentController.create(s);
				System.out.println(status);
			break;
			case 2:
				//collect the ID of student from the user
				System.out.println("Enter the Student id");
				sid=scan.next();
				studentController = StudentControllerFactory.getStudentController();
				s = studentController.display(Integer.parseInt(sid));
				System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
				System.out.println(" "+s.getSid()+" "+s.getSname()+" "+s.getSage()+" "+s.getSaddress());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
				default:
					break;
			}
		}
		
	}

}
