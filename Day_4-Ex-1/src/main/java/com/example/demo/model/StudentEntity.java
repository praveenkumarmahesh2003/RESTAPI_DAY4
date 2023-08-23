package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int id;
	private String name;
	private String depname;
	private String mail;
	
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(int id, String name, String depname, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.depname = depname;
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
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
