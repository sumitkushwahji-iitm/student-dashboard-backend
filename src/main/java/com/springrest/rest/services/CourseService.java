package com.springrest.rest.services;

import java.util.List;

import com.springrest.rest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	
	public Course getCourse(long CourseId);


	public Course addCourse(Course course);


	public Course updateCourse(Course course);


	public String deleteCourse(long CourseId);

}
