package com.corhuila.backendmovilsql.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.backendmovilsql.Entity.TiposProductos;

public interface ITiposProductosService {

	public List<TiposProductos> all();
    
    public Optional<TiposProductos> findById(Long id);
    
    public TiposProductos save(TiposProductos tiposProductos);
    
    public void delete(Long id);
}
