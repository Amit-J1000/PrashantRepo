package com.bikkadit.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
	@Id
	private int aId;
	private String city;
	@ManyToMany
	private List<Employee> emp;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aId, String city, List<Employee> emp) {
		super();
		this.aId = aId;
		this.city = city;
		this.emp = emp;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", emp=" + emp + "]";
	}
	
}
