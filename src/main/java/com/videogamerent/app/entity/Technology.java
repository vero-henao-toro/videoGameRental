package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="technology")
public class Technology implements Serializable {

	private static final long serialVersionUID = -7871065962068017557L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTechnology;
	
	@Column(nullable = false, length = 200)
	private String description;

	public Long getIdTechnology() {
		return idTechnology;
	}

	public void setIdTechnology(Long idTechnology) {
		this.idTechnology = idTechnology;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Technology [idTechnology=" + idTechnology + ", description=" + description + "]";
	}
	
	

}
