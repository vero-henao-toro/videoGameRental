package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="rent_time")
public class RentTime implements Serializable  {

	private static final long serialVersionUID = -714516072439325417L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRentTime;
	
	@Column(nullable = false, length = 200)
	private String description;

}
