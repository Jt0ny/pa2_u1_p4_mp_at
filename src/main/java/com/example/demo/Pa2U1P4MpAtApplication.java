package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.AbstractBindingResult;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4MpAtApplication implements CommandLineRunner {//hacer ese impl se ocupa cuando se crea por defecto y se puede usar la consola
	
	@Autowired
	private CuentaService cuentaService;
	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4MpAtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Cuenta cta1=new Cuenta();
		cta1.setCedulaPropietario("1234");
		cta1.setFechaApertura(LocalDate.now());
		cta1.setNumero("5678");
		cta1.setSaldo(new BigDecimal(200));
		cta1.setTipo("A");
		this.cuentaService.guardar(cta1);
		
		//cta2
		Cuenta cta2=new Cuenta();
		cta2.setCedulaPropietario("234");
		cta2.setFechaApertura(LocalDate.now());
		cta2.setNumero("2056");
		cta2.setSaldo(new BigDecimal(50));
		cta2.setTipo("A");
		this.cuentaService.guardar(cta2);
		
		this.transferenciaService.realizar("5678", "2056", new BigDecimal(10));
		System.out.println("Saldo Origen" +this.cuentaService.buscarPorNumero("5678").getSaldo());
		
		System.out.println("Saldo Destino"+ this.cuentaService.buscarPorNumero("2056").getSaldo());

		

	}
}
