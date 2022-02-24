package com.springrest.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Long Id;
	private String name;
	private String title;
	private String mobile;
	private String guide;
	
	public Student(Long id, String name, String title, String mobile, String guide) {
		super();
		Id = id;
		this.name = name;
		this.title = title;
		this.mobile = mobile;
		this.guide = guide;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	//Default Constructor from super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", title=" + title + ", mobile=" + mobile + ", guide=" + guide
				+ "]";
	}
	
	
	
	
	
	
}
