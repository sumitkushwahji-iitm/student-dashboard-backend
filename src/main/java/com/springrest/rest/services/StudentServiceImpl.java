package com.springrest.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springrest.rest.dao.StudentDao;

import com.springrest.rest.entities.Student;

@Service
public class StudentServiceImpl implements StudentService{

	
//create object of implementation class of Studentdao
	@Autowired
	private StudentDao StudentDao;
//	List<Student> list;
	
	public StudentServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Student((long)145, "sumit", "project assistant", "3479874897249","subasis panja"));
	
	}

     
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return StudentDao.findAll();
//		return list;
	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		StudentDao.save(student);
		return student;
	}

	

	
	

}
