package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="protagonist")
public class Protagonist implements Serializable{

	private static final long serialVersionUID = -8734109711228633855L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProtagonist;
	
	@Column(nullable = false, length = 200)
	private String name;
	
	@Column(nullable = false, length = 200)
	private String firstLastName;
	
	@Column(length = 200)
	private String secondLastName;

	public Long getIdProtagonist() {
		return idProtagonist;
	}

	public void setIdProtagonist(Long idProtagonist) {
		this.idProtagonist = idProtagonist;
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

	@Override
	public String toString() {
		return "Protagonist [idProtagonist=" + idProtagonist + ", name=" + name + ", firstLastName=" + firstLastName
				+ ", secondLastName=" + secondLastName + "]";
	}
	

}
