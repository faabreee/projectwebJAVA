package entidades;

import java.io.InputStream;

public class Producto {
	
	private int idproducto;
	private String nombrePro;
	private String descripcionPro;
	private double precioPro;
	private String imagenPro;
	private int cantidad;
	private String precioTotal;
	
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombrePro() {
		return nombrePro;
	}
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}
	public String getDescripcionPro() {
		return descripcionPro;
	}
	public void setDescripcionPro(String descripcionPro) {
		this.descripcionPro = descripcionPro;
	}
	public double getPrecioPro() {
		return precioPro;
	}
	public void setPrecioPro(double precioPro) {
		this.precioPro = precioPro;
	}
	public String getImagenPro() {
		return imagenPro;
	}
	public void setImagenPro(String imagenPro) {
		this.imagenPro = imagenPro;
	}
	public int getcantidad() {
		return cantidad;
	}
	public void setcantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(String precioTotal) {
		this.precioTotal = precioTotal;
	}	

}
