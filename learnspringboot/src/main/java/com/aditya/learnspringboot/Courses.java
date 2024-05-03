package com.aditya.learnspringboot;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

public class Courses {
	
	private long id;
	private String name;
	private String author;
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	
	public Courses(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	//constructor
	//getters
	//toString
	
	
}
