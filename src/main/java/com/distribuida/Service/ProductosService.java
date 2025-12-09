package com.distribuida.Service;

import com.distribuida.model.MovimientoInventario;
import com.distribuida.model.Productos;

import java.util.List;

public interface ProductosService {
    public List<Productos> findAll();
    public Productos findOne( int id);
    public Productos save( Productos productos);
    public Productos update (Productos productos);
    public void delete (int id);
}
