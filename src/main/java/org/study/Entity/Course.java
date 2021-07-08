package org.study.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@Entity
@Table(name="course")
@JacksonXmlRootElement(localName = "Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JacksonXmlProperty(isAttribute = true)
	private int courseId;
	@JacksonXmlProperty
	@Column(name="course_name")
	private String c_name;
//	@JsonIgnore
//	@JacksonXmlProperty
//	@OneToMany(mappedBy="course")
//	private Set<User> users;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
public Course(int courseId, String c_name) {
	super();
	this.courseId = courseId;
	this.c_name = c_name;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", c_name=" + c_name + "]";
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
	
	
	
}
