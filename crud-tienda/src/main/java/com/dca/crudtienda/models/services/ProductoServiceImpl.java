package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.dao.IProductoDAO;
import com.dca.crudtienda.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private IProductoDAO dao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) dao.findAll();
    }

    @Override
    public Producto findById(long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto p) {
        return dao.save(p);
    }

    @Override
    public void del(Long id) {
        dao.deleteById(id);
    }
}
