package com.abc.persistence;

import com.abc.POJO.Student;

public interface IStudentPersistence
{
	public String create(Student student);

	public Student display(int id);

	public String updateById(Student student);

	public String deleteById(int id);

}
