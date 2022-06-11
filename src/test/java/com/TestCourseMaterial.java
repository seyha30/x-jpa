package com;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Course;
import com.entity.CourseMaterial;
import com.repository.CourseMaterialRepository;

@SpringBootTest
public class TestCourseMaterial {
	@Autowired
	CourseMaterialRepository courseMaterialRepository;

	@Test
	public void saveCourseMaterial() {

		Course course = new Course();
		course.setCourseTitle("new");
		course.setCredit(100);
		CourseMaterial courseMaterial = new CourseMaterial();
		courseMaterial.setUrl("facebook.com");
		courseMaterial.setCourse(course);

		courseMaterialRepository.save(courseMaterial);
	}
	@Test
	public void retrieveAll() {
		
		List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();
		System.out.println(courseMaterials);
	}
	
	

}
