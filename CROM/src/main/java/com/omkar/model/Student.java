package com.omkar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "stuid")
	private Integer stuId;

	@Column(name = "stufname")
	private String stuFname;

	@Column(name = "stulname")
	private String stuLname;

	@Column(name = "stuemail")
	private String stuEmail;

	
	@Column(name = "stuaddress")
	private String stuAddress;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuFname() {
		return stuFname;
	}

	public void setStuFname(String stuFname) {
		this.stuFname = stuFname;
	}

	public String getStuLname() {
		return stuLname;
	}

	public void setStuLname(String stuLname) {
		this.stuLname = stuLname;
	}
	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

}
