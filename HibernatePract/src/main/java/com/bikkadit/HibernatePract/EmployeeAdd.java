package com.bikkadit.HibernatePract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeAdd {
	@Id
	private int add_Id;
	private String add_city;
	@OneToOne(mappedBy = "emp_Add")
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeAdd(int add_Id, String add_city) {
		super();
		this.add_Id = add_Id;
		this.add_city = add_city;
	}
	public int getAdd_Id() {
		return add_Id;
	}
	public void setAdd_Id(int add_Id) {
		this.add_Id = add_Id;
	}
	public String getAdd_city() {
		return add_city;
	}
	public void setAdd_city(String add_city) {
		this.add_city = add_city;
	}
	@Override
	public String toString() {
		return "EmployeeAdd [add_Id=" + add_Id + ", add_city=" + add_city + "]";
	}
	
	
	
}
