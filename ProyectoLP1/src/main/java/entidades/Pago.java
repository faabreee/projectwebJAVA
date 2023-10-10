package entidades;

import java.sql.Date;
import java.time.LocalDate;

public class Pago {
	
	private int idPago;
	private int idCliente;
	private String nombre1Cliente;
	private String nombre2Cliente;
	private String apellido1Cliente;
	private String apellido2Cliente;
	private String provincia;
	private String distrito;
	private String referencia;
	private String metodoPago;
	private String fecha; 
	private double importeSub;
	private double importeTotal;
	
	
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre1Cliente() {
		return nombre1Cliente;
	}
	public void setNombre1Cliente(String nombre1Cliente) {
		this.nombre1Cliente = nombre1Cliente;
	}
	public String getNombre2Cliente() {
		return nombre2Cliente;
	}
	public void setNombre2Cliente(String nombre2Cliente) {
		this.nombre2Cliente = nombre2Cliente;
	}
	public String getApellido1Cliente() {
		return apellido1Cliente;
	}
	public void setApellido1Cliente(String apellido1Cliente) {
		this.apellido1Cliente = apellido1Cliente;
	}
	public String getApellido2Cliente() {
		return apellido2Cliente;
	}
	public void setApellido2Cliente(String apellido2Cliente) {
		this.apellido2Cliente = apellido2Cliente;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public double getImporteSub() {
		return importeSub;
	}
	public void setImporteSub(double importeSub) {
		this.importeSub = importeSub;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
