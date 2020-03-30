package com.newer.service;

import java.util.ArrayList;

import com.newer.domain.T_Student;

public interface StudentService {
public ArrayList selStudent();
public ArrayList selectall(int sno);
public int deleteStudent(int sno);
public int arrStudent(T_Student student);
public int updatestudent(T_Student student);
}
