package com.newer.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.Student;
import com.newer.domain.T_Student;
import com.newer.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
		@Autowired
	private Student Studentdao;
	@Override
	public ArrayList selStudent() {
		// TODO Auto-generated method stub
		return (ArrayList) this.Studentdao.selectAll();
	}
	@Override
	public int deleteStudent(int sno) {
		// TODO Auto-generated method stub
		return this.Studentdao.deleteByPrimaryKey(sno);
	}
	@Override
	public int arrStudent(T_Student student) {
		
		return this.Studentdao.insert(student);
	}
	public int updatestudent(T_Student student) {
		// TODO Auto-generated method stub
		return this.Studentdao.updateByPrimaryKey(student);
	}
	@Override
	public ArrayList selectall(int sno) {
		// TODO Auto-generated method stub
		return this.Studentdao.selectall(sno);
	}

}
