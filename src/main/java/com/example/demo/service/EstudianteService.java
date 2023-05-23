package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	
	public void guardar (Estudiante estudiante );
	public void actulizar (Estudiante estudiante);
	
	// Buscamos por un identificador
	public Estudiante buscarPorCedula (String cedula); 
	//Eliminamos por un identificador
	public void borrar (String cedula);
	
	public List<Estudiante> reporteTodos ();

}
