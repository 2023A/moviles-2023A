package com.corhuila.backendmovilsql.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.backendmovilsql.Entity.Productos;

public interface IProductosService {

	public List<Productos> all();
    
    public Optional<Productos> findById(Long id);
    
    public Productos save(Productos productos);
    
    public void delete(Long id);
}
