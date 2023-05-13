package com.corhuila.backendmovilnosql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.corhuila.backendmovilnosql.Collection.Productos;

public interface IProductosRepository extends MongoRepository<Productos, String>{

}
