package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="type_identification")
public class TypeIdentification implements Serializable{

	private static final long serialVersionUID = 5927719395382082605L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeIdentification;
	
	@Column(length = 50, nullable = false)
	private String description;

	public Long getIdTypeIdentification() {
		return idTypeIdentification;
	}

	public void setIdTypeIdentification(Long idTypeIdentification) {
		this.idTypeIdentification = idTypeIdentification;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TypeIdentification [idTypeIdentification=" + idTypeIdentification + ", description=" + description
				+ "]";
	}

}
