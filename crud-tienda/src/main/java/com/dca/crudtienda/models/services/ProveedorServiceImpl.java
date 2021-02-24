package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.dao.IProveedorDAO;
import com.dca.crudtienda.models.entity.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProveedorServiceImpl implements IProveedorService{

    @Autowired
    private IProveedorDAO dao;

    @Override
    public List<Proveedor> findAll() {
        return (List<Proveedor>) dao.findAll();
    }

    @Override
    public Proveedor findById(long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Proveedor save(Proveedor p) {
        return dao.save(p);
    }

    @Override
    public void del(Long id) {
        dao.deleteById(id);

    }
}
