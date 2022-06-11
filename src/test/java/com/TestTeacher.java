package com;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Course;
import com.entity.Teacher;
import com.repository.TeacherRepository;

@SpringBootTest
public class TestTeacher {
	@Autowired
	TeacherRepository teacherRepository;

	@Test
	public void saveTeacher() {
		Course courseJAVA = new Course();
		courseJAVA.setCourseTitle("JAVA");
		courseJAVA.setCredit(5);
		Course courseSQL = new Course();
		courseSQL.setCourseTitle("SQL");
		courseSQL.setCredit(5);
		Teacher teacher = new Teacher();
		teacher.setCourses(List.of(courseJAVA,courseSQL));
		teacher.setFirstName("chhay");
		teacher.setLastName("chakriya");
		teacherRepository.save(teacher);

	}

}
