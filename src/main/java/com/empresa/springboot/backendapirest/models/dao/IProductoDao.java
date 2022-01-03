package com.empresa.springboot.backendapirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.empresa.springboot.backendapirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
	
	
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> filterByNombre(String texto);
	
	public List<Producto> findByNombreContainingIgnoreCase(String texto);
	
}
