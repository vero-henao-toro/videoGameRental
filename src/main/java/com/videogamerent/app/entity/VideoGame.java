package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="viedeo_game")
public class VideoGame implements Serializable {

	private static final long serialVersionUID = 2147418804175257340L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGame;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 100)
	private String tittle;
	
	@Column(nullable = false, length = 100)
	private String trademark;
	
	@Column(nullable = false, length = 100)
	private String year;
	
	@Column(nullable = false, length = 100)
	private String director;
	
	@Column(nullable = false, length = 100)
	private String producer;

	public Long getIdGame() {
		return idGame;
	}

	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getTrademark() {
		return trademark;
	}

	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "VideoGame [idGame=" + idGame + ", name=" + name + ", tittle=" + tittle + ", trademark=" + trademark
				+ ", year=" + year + ", director=" + director + ", producer=" + producer + "]";
	}
	
	
	

}
