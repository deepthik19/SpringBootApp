package com.springboot.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllTopics(@PathVariable String id) {
		
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Course getTopicById(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}/courses")
	public void addTopic(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}/{courseId}")
	public void updateTopic(@RequestBody Course topic,@PathVariable String id) {
		courseService.updateCourse(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}/{courseId}")
	public void deleteTopic(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
