package com.corhuila.backendmovilnosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Productos")
public class Productos {

	@Id    
    private String id;
	
	@Field
    private String nombre;
	
	@Field
	private Double precio;
	
	@Field
    private String descripcion;
	
	@Field
    private String imagen;
	
	@Field
    private Boolean estado;

	@DBRef
    private TiposProductos tipoProductoId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public TiposProductos getTipoProductoId() {
		return tipoProductoId;
	}

	public void setTipoProductoId(TiposProductos tipoProductoId) {
		this.tipoProductoId = tipoProductoId;
	}	
}
