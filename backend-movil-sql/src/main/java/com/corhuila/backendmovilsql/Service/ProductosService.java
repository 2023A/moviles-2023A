package com.corhuila.backendmovilsql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.backendmovilsql.Entity.Productos;
import com.corhuila.backendmovilsql.IRepository.IProductosRepository;
import com.corhuila.backendmovilsql.IService.IProductosService;

@Service
public class ProductosService implements IProductosService{

	@Autowired
	private IProductosRepository repository;

	@Override
	public List<Productos> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<Productos> findById(Long id) {		
		return repository.findById(id);
	}

	@Override
	public Productos save(Productos productos) {		
		return repository.save(productos);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}
}
