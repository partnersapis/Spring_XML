package org.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.Entity.Course;
import org.study.repository.CourseRepository;
@Service
public class ImplCourseService implements ICourseService{
	@Autowired
	CourseRepository courseRepo;
	@Override
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
		
	}

	@Override
	public Optional<Course> getCourseById(int id) {
		Optional<Course> course= courseRepo.findById(id);
		if(course.isPresent())
		return course;
		return null;
	}

	@Override
	public String addCourse(Course course) {
		Optional<Course> course1=courseRepo.findById(course.getCourseId());
		if(course1.isPresent()) 	
		return "Already exist";
		else
		{
			courseRepo.save(course);
		return "Added successfully";
	}
		}

	@Override
	public String deleteCourse(int id) {
		Optional<Course> course = courseRepo.findById(id);
		if(course.isPresent()) {
			courseRepo.deleteById(id);
			return "deleted successfully";
		}
			
		return "not deleted";
	}

	@Override
	public String updateCourse(Course course,int id) {
		Optional<Course> course1 = courseRepo.findById(id);
		if(course1.isPresent())
		{
			courseRepo.save(course);
			return "updated successfully";
		}
		return "no updattion";
	}

}
