package com.formvalidation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty(message = "should not empty")
	@Size(min = 3, max = 50, message = "{size.person.fullname}")
	private String fullName;
	@NotBlank
	@Email(message = "enter valid email")
	private String email;
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	@NotBlank
	private String gender;
	@Size(max = 100)
	private String note;
	@AssertTrue
	private boolean married;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date birthday;
	@NotBlank
	private String profession;
	@Min(value = 10000)
	@Max(value = 200000)
	private long income;

}
