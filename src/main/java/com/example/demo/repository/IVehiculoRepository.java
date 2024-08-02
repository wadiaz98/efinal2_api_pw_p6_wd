package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Vehiculo;

public interface IVehiculoRepository {
	public void insertar(Vehiculo v);

	public Vehiculo buscarPlaca(String placa);

	public List<Vehiculo> buscarTodos();

	public void eliminar(String placa);
}
