package com;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Student;
import com.repository.StudentRepository;

@SpringBootTest
class XJpaApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void saveStudent() {
		Student student = Student.builder().email("sinseyha1@gmail.com").firstName("sin").lastName("seyha").build();
		studentRepository.save(student);

	}

	@Test
	void showAllStudent() {
		List<Student> students = studentRepository.findAll();
		System.out.println(students);
	}

}
