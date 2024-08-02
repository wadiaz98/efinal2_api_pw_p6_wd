package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.model.Vehiculo;
import com.example.demo.service.dto.VehiculoDTO;
import com.example.demo.service.to.VehiculoTO;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository repository;

	private Vehiculo conversion(VehiculoTO to) {
		Vehiculo v = new Vehiculo();
		v.setColor(to.getColor());
		v.setId(to.getId());
		v.setMarca(to.getMarca());
		v.setModelo(to.getModelo());
		v.setPlaca(to.getPlaca());
		v.setPrecio(to.getPrecio());
		return v;
	}

	private VehiculoTO conversionTO(Vehiculo to) {
		VehiculoTO v = new VehiculoTO();
		v.setColor(to.getColor());
		v.setId(to.getId());
		v.setMarca(to.getMarca());
		v.setModelo(to.getModelo());
		v.setPlaca(to.getPlaca());
		v.setPrecio(to.getPrecio());
		return v;
	}

	private VehiculoDTO conversionDTO(Vehiculo to) {
		VehiculoDTO v = new VehiculoDTO();
		v.setId(to.getId());
		v.setMarca(to.getMarca());
		v.setModelo(to.getModelo());
		v.setPlaca(to.getPlaca());
		return v;
	}

	@Override
	public void guardar(VehiculoTO v) {
		// TODO Auto-generated method stub
		this.repository.insertar(this.conversion(v));
	}

	@Override
	public VehiculoTO consultarPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.conversionTO(this.repository.buscarPlaca(placa));
	}

	@Override
	public List<VehiculoDTO> consultarTodos() {
		// TODO Auto-generated method stub
		List<Vehiculo> list = this.repository.buscarTodos();
		List<VehiculoDTO> dto = new ArrayList<>();
		for (Vehiculo v : list) {
			dto.add(this.conversionDTO(v));
		}
		return dto;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.repository.eliminar(placa);
	}

}
