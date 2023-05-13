package com.corhuila.backendmovilsql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.backendmovilsql.Entity.Productos;

public interface IProductosRepository extends JpaRepository<Productos, Long>{

}
