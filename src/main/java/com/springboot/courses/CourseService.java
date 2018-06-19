package com.springboot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(){
	
		List<Course> courses=new ArrayList<>();
		courseRepository.findAll()//findAll gives an iterable object from the repository
		.forEach(courses::add);
		//Java 8 lambda references for method references for for each
		return courses;
	}
	public Course getCourse(String id) {
		Course course=null;
		course=courseRepository.findOne(id);
		return course;
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
