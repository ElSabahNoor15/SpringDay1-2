package com.SpringApp2.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.SpringApp2.model.Student;



@Repository("studentDao")
public class StudentDaoImpl implements StudentDaoIntf {
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	
	public boolean createStudent(Student student)
	{
		String sql="INSERT into Students values (?,?,?)";
		int result=jdbcTemplateObject.update(sql,new Object[]{student.getId(),student.getName(),student.getGrade()});
		if(result>0){
			System.out.println("Added: "+student);
			return true;
		}
		else
		{
			System.out.println("not added");
			return false;
					
		}
		
		
	}
	//single student
	public Student getStudent(String id)
	{
		String sql="SELECT * from Students where id = ?";
		Student stu = jdbcTemplateObject.query(sql, new Object[]{id},
				new ResultSetExtractor<Student>()
				{
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				Student s = null;
				if (rs.next()){
					s=	new Student();
				s.setId(rs.getString(1));
				s.setName(rs.getString(2));
				s.setGrade(rs.getString(3));
				}
				return s;
			}
					});
		return stu;
		
	}
	
	//list of students
	class StudentMapper implements RowMapper<Student>{

		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getString(1));
			student.setName(rs.getString(2));
			student.setGrade(rs.getString(3));
			return student;
		}
		
	}
	public List<Student> getAll() {
		List<Student> list = null;
		String sql = "select * from Students";
		list= jdbcTemplateObject.query(sql, new StudentMapper());
		return list;
	}
	

}
