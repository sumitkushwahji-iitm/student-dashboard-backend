package com.springrest.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.rest.entities.Course;
import com.springrest.rest.services.CourseService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MyController {
	
	@Autowired
	private CourseService CourseService;

	
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		
		return this.CourseService.getCourses();
		
	}
	
	@GetMapping("/courses/{CourseId}")
	public Course getCourses(@PathVariable String CourseId)
	{
		
		return this.CourseService.getCourse(Long.parseLong(CourseId));
		
	}
	
	@PostMapping("/courses")
	public Course addCourses(@RequestBody Course Course)
	{
		
		return this.CourseService.addCourse(Course);
		
	}
	
	@PutMapping("/courses")
	public Course updateCourses(@RequestBody Course Course)
	{
		
		return this.CourseService.updateCourse(Course);
		
	}
	
	@DeleteMapping("/courses/{CourseId}")
	public String deleteCourses(@PathVariable String CourseId)
	{
		
		return this.CourseService.deleteCourse(Long.parseLong(CourseId));
		
	}

}
 