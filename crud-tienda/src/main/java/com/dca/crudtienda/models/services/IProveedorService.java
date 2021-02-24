package com.dca.crudtienda.models.services;

import com.dca.crudtienda.models.entity.Proveedor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProveedorService {
    public List<Proveedor> findAll();

    public Proveedor findById(long id);

    public Proveedor save (Proveedor p);

    public void del (Long id);
}
