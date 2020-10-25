package com.videogamerent.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="price_time")
public class PriceTime implements Serializable{

	private static final long serialVersionUID = -4330780719028565132L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPriceTime;
	
	@Column(nullable = false)
	private Long idTechGame;
	
	@Column(nullable = false)
	private Long idRentTime;
	
	@Column(nullable = false)
	private Float price;

	@Override
	public String toString() {
		return "PriceTime [idPriceTime=" + idPriceTime + ", idTechGame=" + idTechGame + ", idRentTime=" + idRentTime
				+ ", price=" + price + "]";
	}

	public Long getIdPriceTime() {
		return idPriceTime;
	}

	public void setIdPriceTime(Long idPriceTime) {
		this.idPriceTime = idPriceTime;
	}

	public Long getIdTechGame() {
		return idTechGame;
	}

	public void setIdTechGame(Long idTechGame) {
		this.idTechGame = idTechGame;
	}

	public Long getIdRentTime() {
		return idRentTime;
	}

	public void setIdRentTime(Long idRentTime) {
		this.idRentTime = idRentTime;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
