package com.distribuida.Service;

import com.distribuida.model.Cliente;
import com.distribuida.model.MovimientoInventario;

import java.util.List;

public interface MovimientoInventarioService {
    public List<MovimientoInventario> findAll();
    public MovimientoInventario findOne( int id);
    public MovimientoInventario save( MovimientoInventario movimientoInventario);
    public MovimientoInventario update (MovimientoInventario movimientoInventario);
    public void delete (int id);
}
