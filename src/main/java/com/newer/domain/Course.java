package com.newer.domain;

public class Course {
private Integer Cno;
private String Cname;
public Integer getCno() {
	return Cno;
}
public void setCno(Integer cno) {
	Cno = cno;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public Course(Integer cno, String cname) {
	super();
	Cno = cno;
	Cname = cname;
}
public Course() {
	super();
}


}
