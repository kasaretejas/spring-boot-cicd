package com.tejas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tejas.models.Course;

@Service
public class CourseService {
	
	private List<Course> courses = new ArrayList<>();
	
	public String addCourse(Course course)
	{
		 courses.add(course);
		 return "Course added";
	}
	
	public List<Course> viewCourses()
	{
		return courses;
	}

}
