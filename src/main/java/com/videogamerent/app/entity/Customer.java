package com.videogamerent.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = -7170579028031441908L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	
	@Column(length = 50, nullable = false, unique = true)
	private String identification;
	
	@Column(nullable = false)
	private Long idType;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 100)
	private String firstLastName;
	
	@Column(nullable = false, length = 100)
	private String secondLastName;
	
	@Column(nullable = false, length = 20)
	private String phoneNumber;
	
	@Column(nullable = false, length = 200)
	private String address;
	
	@Column(nullable = false)
	private Integer age;
	
	@Column(nullable = false)
	private Date birthDate;


	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public Long getIdType() {
		return idType;
	}
	public void setIdType(Long idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstLastName() {
		return firstLastName;
	}
	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}
	public String getSecondLastName() {
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", firstLastName=" + firstLastName + ", secondLastName=" + secondLastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", age=" + age + ", birthDate=" + birthDate
				+ ", idCustomer=" + idCustomer + ", identification=" + identification + ", idType=" + idType + "]";
	}
}
