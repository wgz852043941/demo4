package com.newer.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Table(name="useravatar")
public class UserAvatar {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer uid;
private String username;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date time;

private String avatar;
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getAvatar() {
	return avatar;
}
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
public UserAvatar(Integer uid, String username, Date time, String avatar) {
	super();
	this.uid = uid;
	this.username = username;
	this.time = time;
	this.avatar = avatar;
}
public UserAvatar() {
	super();
}


}
