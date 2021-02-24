package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.entity.Factura;

import java.util.List;

public interface IFacturaService {
    public List<Factura> findAll();

    public Factura findById(long id);

    public Factura save (Factura f);

    public void del (Long id);
}
