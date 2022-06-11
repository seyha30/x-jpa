package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	private String courseTitle;
	private Integer credit;
	@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;

	@ManyToMany
	@JoinTable(
			name = "student_course_map",
			joinColumns = @JoinColumn(referencedColumnName = "courseId",name = "course_id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "studentId",name = "student_id")
			)
	private List<Student> students;
}
