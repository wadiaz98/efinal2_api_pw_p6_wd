package com.example.demo.repository.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "seq_veh", sequenceName = "seq_veh")
	@GeneratedValue(generator = "seq_veh", strategy = GenerationType.SEQUENCE)
	@Column(name = "veh_id")
	private Integer id;
	@Column(name ="veh_placa")
	private String placa;
	@Column(name = "veh_marca")
	private String marca;
	@Column(name = "veh_modelo")
	private String modelo;
	@Column(name = "veh_color")
	private String color;
	@Column(name = "veh_precio")
	private BigDecimal precio;

	// SET Y GET
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
