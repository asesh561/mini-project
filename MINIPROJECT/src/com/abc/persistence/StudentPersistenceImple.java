package com.abc.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abc.POJO.Student;

import utility.JdbcUtil;


public class StudentPersistenceImple implements IStudentPersistence {

	@Override
	public String create(Student student)
	{
		Connection connection=null;
		PreparedStatement pstmt=null;
		try
		{
			connection = JdbcUtil.getDBConnection();
			if(connection!=null)
			{
				String SQL_INSERT_QUERY="INSERT INTO STUDENT(SID,SNAME,SAGE,SADDRESS)VALUES(?,?,?,?)";
				pstmt=connection.prepareStatement(SQL_INSERT_QUERY);
				if(pstmt!=null)
				{
					pstmt.setInt(1, student.getSid());
					pstmt.setString(2,student.getSname());
					pstmt.setInt(3, student.getSage());
					pstmt.setString(4, student.getSaddress());
					int rowCount = pstmt.executeUpdate();
					if(rowCount>0)
					{
						return "record Inserted Successfully....";
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(null, pstmt, connection);
		}
		return "Record insertion failed...";
	}

	@Override
	public Student display(int id) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
		try
		{
			connection = JdbcUtil.getDBConnection();
			if(connection!=null)
			{
				String SQL_SELECT_QUERY="SELECT SID,SNAME,SAGE,SADDRESS FROM STUDENT WHERE SID=?";
				pstmt=connection.prepareStatement(SQL_SELECT_QUERY);
				if(pstmt!=null)
				{
					pstmt.setInt(1, id);
					resultSet = pstmt.executeQuery();
					if(resultSet.next())
					{
						Student s = new Student();
						s.setSid(resultSet.getInt(1));
						s.setSname(resultSet.getString(2));
						s.setSage(resultSet.getInt(3));
						s.setSaddress(resultSet.getString(4));
						return s;
					}
				}
			}
			
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(resultSet, pstmt, connection);
		}
		return null;
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
