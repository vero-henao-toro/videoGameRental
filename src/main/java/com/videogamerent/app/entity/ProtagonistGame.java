package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="protagonist_games")
public class ProtagonistGame implements Serializable {

	private static final long serialVersionUID = -606229967993570778L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProtaginistGame;
	
	@Column(nullable = false)
	private Long idProtaginist;
	
	@Column(nullable = false)
	private Long idGame;

}
