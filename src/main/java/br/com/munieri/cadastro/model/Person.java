package br.com.munieri.cadastro.model;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Person {
	
    private Long id;
    private String name;
    private Calendar dateBirth;
    private String phone;
    private String mobile;
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
	public Calendar getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Calendar dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
