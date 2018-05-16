package com.youtube.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "users")
@Access(AccessType.FIELD)
public class Usuario extends EntidadPadre  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6547709702224666746L;

	@Column(name= "NOMBRE", nullable= false, length = 100)
	private String nombre;
	
	@Column(name= "APELLIDO", nullable= false, length = 100)
	private String apellido;
	
	@Column(name= "MOVIL", nullable= true, length = 10)
	private String movil;
	
	@Column(name= "DIRECCION", nullable= false, length = 300)
	private String direccion;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
