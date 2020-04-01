package com.newer.domain;

public class wgz {
public int id;
public String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public wgz(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "wgz [id=" + id + ", name=" + name + "]";
}


}
