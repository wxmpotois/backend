package com.youtube.modelo;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
@Access(AccessType.FIELD)
public class EntidadPadre implements Serializable {


	private static final long serialVersionUID = 7039847989217002452L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="IDUSUARIO", unique= true, nullable = false)
private Long IDUSUARIO;
public Long getIDUSUARIO() {
	return IDUSUARIO;
}
public void setIDUSUARIO(Long iDUSUARIO) {
	IDUSUARIO = iDUSUARIO;
}


}
