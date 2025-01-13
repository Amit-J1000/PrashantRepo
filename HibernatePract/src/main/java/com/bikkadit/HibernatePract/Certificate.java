package com.bikkadit.HibernatePract;

import javax.persistence.ManyToOne;


public class Certificate {

	
	private int courseId;
	private String CourseName;
	@ManyToOne
	private Student s;
	
	public Certificate(int courseId, String courseName, Student s) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
		this.s = s;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public String toString() {
		return "Certificate [courseId=" + courseId + ", CourseName=" + CourseName + ", s=" + s + "]";
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Certificate(int courseId, String courseName) {
//		super();
//		this.courseId = courseId;
//		CourseName = courseName;
//	}
//	@Override
//		public String toString() {
//		return "Certificate [courseId=" + courseId + ", CourseName=" + CourseName + "]";
//	}
	
	
}
