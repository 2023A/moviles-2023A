package com.corhuila.backendmovilnosql.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.backendmovilnosql.Collection.TiposProductos;

public interface ITiposProductosService {

	public List<TiposProductos> all();
    
    public Optional<TiposProductos> findById(String id);
    
    public TiposProductos save(TiposProductos tiposProductos);
    
    public void delete(String id);
}
