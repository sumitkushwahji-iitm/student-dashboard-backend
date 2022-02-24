package com.springrest.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.rest.entities.Course;
import com.springrest.rest.entities.Student;

public interface StudentDao extends JpaRepository<Student, Long>{

}


