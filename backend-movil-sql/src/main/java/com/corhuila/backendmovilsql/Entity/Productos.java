package com.corhuila.backendmovilsql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
	
	@Column(name = "precio", nullable = false, length = 1000)
	private Double precio;
	
	@Column(name = "descripcion", nullable = false, length = 1000)
    private String descripcion;
	
	@Column(name = "imagen", nullable = false)
    private String imagen;
	
	@Column(name = "estado", nullable = false, length = 1000)
    private Boolean estado;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_producto_id", nullable = false)
    private TiposProductos tipoProductoId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
