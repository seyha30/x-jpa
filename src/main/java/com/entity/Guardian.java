package com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Guardian { //អាណាព្យាបាល
	private String guardianName;
	@Column(name = "email_address")
	private String guardianEmail;
	private String guardianMobile;

}
