package com.sony.SpringMvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "springmvc_reg_details")
public class SpringMvcRegistrationDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middelName")
	private String middelName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="number")
	private String number;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private String age;
	
	@Column(name="Male")
	private String Male;
	
	@Column(name="Female")
	private String Female;
	
	@Column(name="Others")
	private String Others;
	
	@Column(name="otp")
	private int oTP;
	
	

	
}
