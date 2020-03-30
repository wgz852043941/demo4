package com.newer.domain;

public class SC {
private Integer Sno;
private Integer Cno;
private Integer score;
public Integer getSno() {
	return Sno;
}
public void setSno(Integer sno) {
	Sno = sno;
}
public Integer getCno() {
	return Cno;
}
public void setCno(Integer cno) {
	Cno = cno;
}
public Integer getScore() {
	return score;
}
public void setScore(Integer score) {
	this.score = score;
}
public SC(Integer sno, Integer cno, Integer score) {
	super();
	Sno = sno;
	Cno = cno;
	this.score = score;
}
public SC() {
	super();
}

}
