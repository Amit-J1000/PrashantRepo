package com.bikkadIt.NoteTaker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sId;
	private String sFName;
	private String sLName;
	private String scity;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsFName() {
		return sFName;
	}
	public void setsFName(String sFName) {
		this.sFName = sFName;
	}
	public String getsLName() {
		return sLName;
	}
	public void setsLName(String sLName) {
		this.sLName = sLName;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public Student(int sId, String sFName, String sLName, String scity) {
		super();
		this.sId = sId;
		this.sFName = sFName;
		this.sLName = sLName;
		this.scity = scity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sFName=" + sFName + ", sLName=" + sLName + ", scity=" + scity + "]";
	}
	
	
	 
	
	
}
