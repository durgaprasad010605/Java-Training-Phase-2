package com.demo.model;

public class Student {
	private int id;
	private String name;
	private String course;
	private String mail;
	public Student(int id, String name, String course, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mail = mail;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
