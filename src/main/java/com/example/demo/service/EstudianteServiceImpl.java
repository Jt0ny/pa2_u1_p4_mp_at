package com.example.demo.service;

import java.util.List;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Override
	public void guardar(Estudiante estudiante) {
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void actulizar(Estudiante estudiante) {
		this.estudianteRepository.actulizar(estudiante);
		
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		return this.estudianteRepository.seleccionar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		this.estudianteRepository.eliminar(cedula);
		
	}

	@Override
	public List<Estudiante> reporteTodos() {
		return this.estudianteRepository.seleccionarTodos();
	}

}
