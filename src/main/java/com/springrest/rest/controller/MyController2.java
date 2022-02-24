package com.springrest.rest.controller;


import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.PrintConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.springrest.rest.entities.Student;
import com.springrest.rest.pdf.UserPDFExporter;
import com.springrest.rest.services.StudentService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MyController2 {
	
	@Autowired
	private StudentService StudentService;

	
	
	//get the student data
	
	@GetMapping("/student")
	public List<Student> getStudent()
	{
		
 	return this.StudentService.getStudent();
		
	}
	
//	@GetMapping("/courses/{CourseId}")
//	public Course getCourses(@PathVariable String CourseId)
//	{
//		
//		return this.CourseService.getCourse(Long.parseLong(CourseId));
//		
//	}
//	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student Student)
	{
		
		return this.StudentService.addStudent(Student);
		
	}
	
	@GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
        System.out.println("inside mapping");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<Student> listUsers = StudentService.getStudent();
         
        UserPDFExporter exporter = new UserPDFExporter(listUsers);
        exporter.export(response);     
    }
//	
//	@PutMapping("/courses")
//	public Course updateCourses(@RequestBody Course Course)
//	{
//		
//		return this.CourseService.updateCourse(Course);
//		
//	}
//	
//	@DeleteMapping("/courses/{CourseId}")
//	public String deleteCourses(@PathVariable String CourseId)
//	{
//		
//		return this.CourseService.deleteCourse(Long.parseLong(CourseId));
//		
//	}

}
 