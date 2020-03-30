package com.newer.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import com.newer.domain.T_Student;

import tk.mybatis.mapper.common.Mapper;

public interface Student extends Mapper<T_Student>{
	
	@Select("select * from Student,Course,SC WHERE Student.sno=sc.Sno and Course.Cno=sc.Cno and Student.Sno=#{sno}")
	public ArrayList<T_Student> selectall(int sno);
	
	
}
