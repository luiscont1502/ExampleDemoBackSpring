package example.spring.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Products")
@Entity
public class Product implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idProduct;
	
	@Column(name="name")
	private String name;
	
	@Column(name="precio")
	private float precio;
	
	@Column(name="cantidad")
	private Long cantidad;
	
	@Column(name="detalle")
	private String detalle;
	
	
	public Product() {
		super();
	}
	public Product(Long idProduct) {
		super();
		this.idProduct=idProduct;	
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setFirstName(String name) {
		this.name = name;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public Product(Long idProduct, String name, float precio, Long cantidad, String detalle) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.precio = precio;
		this.cantidad = cantidad;
		this.detalle = detalle;
	}
	public Product(String name, float precio, Long cantidad, String detalle) {
		super();
		this.name = name;
		this.precio = precio;
		this.cantidad = cantidad;
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", precio=" + precio + ", cantidad=" + cantidad
				+ ", detalle=" + detalle + "]";
	}
	
	

}
