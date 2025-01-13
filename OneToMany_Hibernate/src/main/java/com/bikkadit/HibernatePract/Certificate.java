package com.bikkadit.HibernatePract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Certificate {

	@Id
	private int courseId;
	private String CourseName;
	@ManyToOne()
	
	private Student student;
	
	public Certificate(int courseId, String courseName, Student s) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
		this.student = s;
	}
	public Student getS() {
		return student;
	}
	public void setS(Student s) {
		this.student = s;
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
		return "Certificate [courseId=" + courseId + ", CourseName=" + CourseName + ", s=" + student + "]";
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
