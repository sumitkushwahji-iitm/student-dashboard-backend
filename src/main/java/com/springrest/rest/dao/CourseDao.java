package com.springrest.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.rest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
