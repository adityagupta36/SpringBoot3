package com.aditya.learnspringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	 public List<Courses> retrieveAllCourses(){
		 return Arrays.asList(
				 new Courses(1,"Learn AWS" , "with Aditya") ,  
				 new Courses(2, "Learn Devops" , "with Atmiya"),
				 new Courses(3, "Learn Azure" , "with Anand"),
				 new Courses(4, "Learn SpringBoot" , "with Akshar")
				 
				 );
	 }
	
//	@RequestMapping("/courses")
//	public List<Courses> retrieveAllCourses(){
//		List<Courses> list = new ArrayList<Courses>();
//		list.add(new Courses(1,"Learn AWS" , "with Anand"));
//		list.add(new Courses(2,"Learn Devops" , "with Atmiya"));
//
//		return list;
//	}

}
