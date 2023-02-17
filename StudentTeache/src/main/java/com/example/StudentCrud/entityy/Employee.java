package com.example.StudentCrud.entityy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Teacher")
@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


	private Long Eid;
	
	private String Ename;
	private String Eadd;

	private int Esal;
	
	private String Email;
	
	public Employee(Long eid, String ename, String eadd, int esal, String email) {
		super();
		Eid = eid;
		Ename = ename;
		Eadd = eadd;
		Esal = esal;
		Email = email;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Employee() {
		
	}

	

	public Long getEid() {
		return Eid;
	}

	public void setEid(Long eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEadd() {
		return Eadd;
	}

	public void setEadd(String eadd) {
		Eadd = eadd;
	}

	public int getEsal() {
		return Esal;
	}

	public void setEsal(int esal) {
		Esal = esal;
	}
	
	}
