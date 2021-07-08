package org.study.service;

import java.util.List;
import java.util.Optional;

import org.study.Entity.Course;

public interface ICourseService {
	
	public List<Course> getAllCourse();
	public Optional<Course> getCourseById(int id);
	public String addCourse(Course course);
	public String deleteCourse(int id);
	public String updateCourse(Course course , int id);
}
