package com.example.demo.service.to;

import java.io.Serializable;
import java.math.BigDecimal;

public class VehiculoTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8637830394233244770L;
	private Integer id;
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private BigDecimal precio;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
