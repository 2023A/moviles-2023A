package com.corhuila.backendmovilnosql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.corhuila.backendmovilnosql.Collection.TiposProductos;

public interface ITiposProductosRepository extends MongoRepository<TiposProductos, String>{

}
