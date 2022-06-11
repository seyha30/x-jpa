package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long teacherId;
	private String firstName;
	private String lastName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "teacherId", name = "teacher_id")
	private List<Course> courses;// one teacher can have multiple courses

}
