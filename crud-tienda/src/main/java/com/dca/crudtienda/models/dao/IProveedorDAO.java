package com.dca.crudtienda.models.dao;

import com.dca.crudtienda.models.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface IProveedorDAO extends CrudRepository<Proveedor, Long> {
}
