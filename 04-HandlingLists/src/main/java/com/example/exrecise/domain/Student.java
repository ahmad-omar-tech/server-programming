package com.example.exrecise.domain;

public class Student {
	private String firstname;
	private String lastname;
	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		}
		public String getFirstname() {
			return firstname;
		}
		public String getLastname() {
			return lastname;
		}
}
