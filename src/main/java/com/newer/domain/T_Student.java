package com.newer.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Student")
public class T_Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer Sno;
private String Sname;
private String cname;
private Integer score;

public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Integer getScore() {
	return score;
}
public void setScore(Integer score) {
	this.score = score;
}
public Integer getSno() {
	return Sno;
}
public void setSno(Integer sno) {
	Sno = sno;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public T_Student(Integer sno, String sname) {
	super();
	Sno = sno;
	Sname = sname;
}
public T_Student() {
	super();
}


	
}
