package com.empresa.springboot.backendapirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.springboot.backendapirest.models.entity.Cliente;
import com.empresa.springboot.backendapirest.models.entity.Region;

//Se extiende de JpaRepository para poder implementar el metodo de findAll() con paginación
public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	@Query("from Region")
	public List<Region> findAllRegiones();

}
