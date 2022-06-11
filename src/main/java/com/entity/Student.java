package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.Data;

@Entity(name = "tbl_student")
@Data
@Builder
@Table(name = "tbl_student", uniqueConstraints = @UniqueConstraint(columnNames = "email_address"))
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	private String firstName;
	private String lastName;
	private String email;

//	private String guardianName;
//	@Column(name = "email_address")
//	private String guardianEmail;
//	private String guardianMobile;
	@Embedded
	private Guardian guardian;
	

}
