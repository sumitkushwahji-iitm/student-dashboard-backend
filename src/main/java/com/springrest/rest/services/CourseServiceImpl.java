package com.springrest.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.rest.dao.CourseDao;
import com.springrest.rest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	
//create object of implementation class of CourseDao
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course((long) 145, "java", "this is java"));
//		list.add(new Course(146, "spring", "this is spring"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long CourseId) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == CourseId) {
//				c= course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getOne(CourseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		for(Course course2 : list) {
//			if(course2.getId() == course.getId()) {
//				course2= course;
//				break;
//			}
//		}
		courseDao.save(course);
		return course;
	}

	@Override
	public String deleteCourse(long CourseId) {
//		for(Course course : list) {
//			if(course.getId() == CourseId) {
//				course= null;
//				break;
//			}
//		}
//		return "element deleted";
		Course entity= courseDao.getOne(CourseId);
		courseDao.delete(entity);
		return "deleted";
	}

	

	
	

}
