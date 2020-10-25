package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tech_games")
public class TechnologyGame implements Serializable {

	private static final long serialVersionUID = 1021011580556080371L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTechGame;
	
	@Column(nullable = false)
	private Long idGame;
	
	@Column(nullable = false)
	private Integer quantity;

}
