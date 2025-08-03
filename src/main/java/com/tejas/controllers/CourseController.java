package com.tejas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.models.Course;
import com.tejas.services.CourseService;



@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@PostMapping("/courses")
	private String addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}
	
	@GetMapping("/courses")
	private List<Course> viewCourses()
	{
		return courseService.viewCourses();
	}

}
