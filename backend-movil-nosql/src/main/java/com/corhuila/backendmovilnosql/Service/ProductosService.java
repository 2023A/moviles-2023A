package com.corhuila.backendmovilnosql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.backendmovilnosql.Collection.Productos;
import com.corhuila.backendmovilnosql.IRepository.IProductosRepository;
import com.corhuila.backendmovilnosql.IService.IProductosService;

@Service
public class ProductosService implements IProductosService{

	@Autowired
	private IProductosRepository repository;

	@Override
	public List<Productos> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<Productos> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Productos save(Productos productos) {		
		return repository.save(productos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}
}
