package com.empresa.springboot.backendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.empresa.springboot.backendapirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
