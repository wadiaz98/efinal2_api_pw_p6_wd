package com.example.demo.service.dto;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class VehiculoDTO extends RepresentationModel<VehiculoDTO> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 539950777416947468L;

	private Integer id;
	private String placa;
	private String marca;
	private String modelo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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
}
