package com.example.proj_tns_30.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//to give an instruction to jakata that this is entity class
@Entity
@Table //to do auto conversion of data into table 
public class Admin {
	@Id  // to give instruction  to JPA that id is primary key -->@Id annotation
	private Long id;
	private String name;
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
