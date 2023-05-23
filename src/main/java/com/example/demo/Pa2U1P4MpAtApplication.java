package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.AbstractBindingResult;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4MpAtApplication implements CommandLineRunner {//hacer ese impl se ocupa cuando se crea por defecto y se puede usar la consola
	
	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4MpAtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Tipan");
		miEstudiante.setCedula("1726787425");
		miEstudiante.setNombre("Anthony");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(2001,8,1,10,50));
		
		
		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Valladares");
		miEstudiante1.setCedula("1726787427");
		miEstudiante1.setNombre("Luis");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(2001,8,1,10,50));
		
		//1.Guardar
		this.estudianteService.guardar(miEstudiante);
		this.estudianteService.guardar(miEstudiante1);
		
		//
		
		//5.Imprimir reporte
		List <Estudiante> reporte = this.estudianteService.reporteTodos();
		System.out.println("Reporte de todos los estudiantes");
		for(Estudiante estu:reporte) {
			System.out.println(estu);
		}
		//2.Actualizar
		miEstudiante1.setApellido("Bastidas");
		this.estudianteService.actulizar(miEstudiante1);
		//5.Imprimir reporte
		List <Estudiante> reporte2 = this.estudianteService.reporteTodos();
		System.out.println("Reporte 2 de todos los estudiantes");
		for(Estudiante estu:reporte2) {
			System.out.println(estu);
		}
		
		
		//3.Eliminar
		this.estudianteService.borrar("1726787425");
		//5.Imprimir reporte
		List <Estudiante> reporte3 = this.estudianteService.reporteTodos();
		System.out.println("Reporte 3 de todos los estudiantes");
		for(Estudiante estu:reporte3) {
			System.out.println(estu);
		}
		
		//4.Busqueda
		System.out.println("Busqueda:\n"+this.estudianteService.buscarPorCedula("1726787427"));
		
		System.out.println(this.estudianteService.buscarPorCedula("1726787523"));
	}
}
