package org.study.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.study.Entity.Course;
import org.study.service.ICourseService;

@RestController
public class CourseController {
	
	@Autowired
	private ICourseService iCourseService;
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return iCourseService.getAllCourse();
	}
	@GetMapping("{id}")
	public Optional<Course> getCourseById(@PathVariable int id)
	{
		return iCourseService.getCourseById(id);
	}
	@PostMapping("course")
	public String addCourse(@RequestBody Course course) {
		return iCourseService.addCourse(course);
	}
	@PutMapping("course/{id}")
	public String updateCourse(@RequestBody Course course,@PathVariable int id) {
		return iCourseService.updateCourse(course, id);
	}
	@DeleteMapping("deletecourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		return iCourseService.deleteCourse(id);
	}
	
}
