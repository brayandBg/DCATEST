package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IProductoService {
    public List<Producto> findAll();

    public Producto findById(long id);

    public Producto save (Producto p);

    public void del (Long id);
}
