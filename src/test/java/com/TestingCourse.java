package com;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Course;
import com.repository.CourseRepository;

@SpringBootTest
public class TestingCourse {

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void saveCourse() {
		Course course = new Course();
		course.setCourseTitle("new course");
		course.setCredit(3000);
        courseRepository.save(course);
       List<Course> courses = courseRepository.findAll();
       System.out.println(course);

	}

}
