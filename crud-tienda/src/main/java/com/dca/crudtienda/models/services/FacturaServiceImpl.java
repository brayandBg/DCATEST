package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.dao.IFacturaDAO;
import com.dca.crudtienda.models.entity.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements IFacturaService{

    @Autowired
    private IFacturaDAO dao;

    @Override
    public List<Factura> findAll() {
        return (List<Factura>) dao.findAll();
    }

    @Override
    public Factura findById(long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Factura save(Factura f) {
        return dao.save(f);
    }

    @Override
    public void del(Long id) {
        dao.deleteById(id);

    }
}
