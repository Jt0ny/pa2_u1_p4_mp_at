package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

public class Estudiante {
	
	private String nombre ;
	private String apellido;
	private String cedula;
	private LocalDateTime nacimiento;
	
	// SET Y GET  
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDateTime nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	

}
