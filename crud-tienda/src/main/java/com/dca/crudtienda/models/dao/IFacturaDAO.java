package com.dca.crudtienda.models.dao;

import com.dca.crudtienda.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDAO extends CrudRepository <Factura , Long> {

}
