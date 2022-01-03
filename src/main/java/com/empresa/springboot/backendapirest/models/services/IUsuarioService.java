package com.empresa.springboot.backendapirest.models.services;

import com.empresa.springboot.backendapirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findUserByUsername(String username);

}
