package com.dca.crudtienda.models.dao;

import com.dca.crudtienda.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
}
