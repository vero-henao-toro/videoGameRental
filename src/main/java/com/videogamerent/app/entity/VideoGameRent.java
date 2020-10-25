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
@Table(name ="video_game_rent")
public class VideoGameRent implements Serializable {

	private static final long serialVersionUID = -3696502305995559130L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVideoGameRent;
	
	@Column(nullable = false)
	private Long idCliente;
	
	@Column(nullable = false)
	private Date rentDate;
	
	@Column(nullable = false)
	private Date returnDate;
	
	@Column(nullable = false)
	private Long idPriceRent;

}
