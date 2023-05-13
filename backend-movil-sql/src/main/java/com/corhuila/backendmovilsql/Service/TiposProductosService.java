package com.corhuila.backendmovilsql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.backendmovilsql.Entity.TiposProductos;
import com.corhuila.backendmovilsql.IRepository.ITiposProductosRepository;
import com.corhuila.backendmovilsql.IService.ITiposProductosService;

@Service
public class TiposProductosService implements ITiposProductosService{

	@Autowired
	private ITiposProductosRepository repository;
	
	@Override
	public List<TiposProductos> all() {	
		return repository.findAll();
	}

	@Override
	public Optional<TiposProductos> findById(Long id) {		
		return repository.findById(id);
	}

	@Override
	public TiposProductos save(TiposProductos tiposProductos) {	
		return repository.save(tiposProductos);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}
}
