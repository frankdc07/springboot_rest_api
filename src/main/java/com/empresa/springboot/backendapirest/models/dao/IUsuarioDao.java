package com.empresa.springboot.backendapirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.empresa.springboot.backendapirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	//Usando el nombre del metodo reservado. Con And se pueden agregar mas parametros de consulta al select
	public Usuario findByUsername(String username);
	//Usando la anotacion query con cualquier nombre de metodo
	@Query("select u from Usuario u where u.username = ?1")
	public Usuario findByNombreUsuario(String username);

}
