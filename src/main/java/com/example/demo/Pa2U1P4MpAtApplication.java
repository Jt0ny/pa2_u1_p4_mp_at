package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4MpAtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4MpAtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mi primer proyecto");
		Profesor profe = new Profesor ();
		profe.setApellido("Valladare");
		profe.setCedula("1726787425");
		profe.setFechaNacimiento(LocalDateTime.now());
		profe.setNombre("Anthony");
		System.out.println(profe);
		
		
	}

}
