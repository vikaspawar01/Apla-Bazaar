package com.example.springmvc.models;

public class User {
	private Integer id;
	private String name;
	private String city;
	private String email;
	private String password;
	
	public User() {
	}

	public User(Integer id, String name, String city, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", password=" + password
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
