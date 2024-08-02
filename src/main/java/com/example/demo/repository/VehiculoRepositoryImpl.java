package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.manager.persist(v);
	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> query = this.manager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa = :placa",
				Vehiculo.class);
		query.setParameter("placa", placa);
		return query.getSingleResult();
	}

	@Override
	public List<Vehiculo> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Vehiculo> query = this.manager.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class);

		return query.getResultList();
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscarPlaca(placa));
	}

}
