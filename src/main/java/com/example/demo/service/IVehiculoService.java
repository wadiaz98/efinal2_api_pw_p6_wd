package com.example.demo.service;

import java.util.List;

import com.example.demo.service.dto.VehiculoDTO;
import com.example.demo.service.to.VehiculoTO;

public interface IVehiculoService {

	public void guardar(VehiculoTO v);

	public VehiculoTO consultarPlaca(String placa);

	public List<VehiculoDTO> consultarTodos();

	public void eliminar(String placa);
}
