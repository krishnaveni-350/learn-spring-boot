package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses
//[
//{
//	 "id":1,
// "name": "Learn SpringBoot", 
//	 "author": "KrishPradeep"
//}
//]
		 
@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "Pradeep"), new Course(2, "Learn DevOps", "Pradeep"),
				new Course(3, "Learn Azure", "Pradeep"));
	}

}
