package org.study.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name="users")
@JacksonXmlRootElement(localName = "User")
//@JacksonXmlRootElement annotation  set the name for the XML output root element
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@JacksonXmlProperty(isAttribute = true)
		//With the @JacksonXmlProperty we set the id to be an attribute of the User element in the XML output
		private int id;
		@Column(name = "user_name", nullable = false)
		@JacksonXmlProperty
		
		private String name;
		@Column(name = "user_email", nullable = false)
		@JacksonXmlProperty
		private String email;
		@Column(name="user_salary", nullable = false)
		@JacksonXmlProperty
		private int salary;
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name="courseId",referencedColumnName = "courseId", nullable=false)
		private Course course;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String name, String email, int salary, Course course) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.salary = salary;
			this.course = course;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", course="
					+ course + "]";
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Course getCourse() {
			return course;
		}
		public void setCourse(Course course) {
			this.course = course;
		}
	
}
