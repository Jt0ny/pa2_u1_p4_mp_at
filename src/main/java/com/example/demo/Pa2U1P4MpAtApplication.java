package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.AbstractBindingResult;

import com.example.demo.banco.repository.modelo.Cajero;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Impuesto;
import com.example.demo.banco.repository.modelo.Presidente;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CargaSistemaService;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4MpAtApplication implements CommandLineRunner {//hacer ese impl se ocupa cuando se crea por defecto y se puede usar la consola
	@Autowired
	private Cajero cajero;
	@Autowired
	private Cajero cajero1;
	
	@Autowired
	private Presidente presidente;
	
	@Autowired
	private Presidente presidente2;
	
	@Autowired
	private CargaSistemaService cargaSistemaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4MpAtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	this.cajero.setApellido("Tipan");
	this.cajero.setNombre("Lucho");
	this.cajero.setSalario(new BigDecimal(100));
	System.out.println(this.cajero);
	
	this.cajero1.setApellido("Valladares");
	System.out.println(this.cajero1);
	System.out.println(this.cajero1.getApellido());
		
	this.presidente.setApellido("Ramos");
	this.presidente.setNombre("Andrea");
	this.presidente.setCedula("123168498");
	
	this.presidente2.setApellido("Aguas");
	
	System.out.println(this.presidente);
	System.out.println(this.presidente2);
	
	System.out.println(">>>>>>>>>>>>>>>>Segunda parte del Taller");
	
	this.cargaSistemaService.cargar();
	Transferencia trans= new Transferencia();
	trans.setCuentaDestino(null);
	trans.setCuentaOrigen(null);
	trans.setFecha(LocalDateTime.now());
	trans.setMonto(new BigDecimal(100));
	trans.setNumero("123232");
	this.transferenciaService.guardar(trans);
	
	
		
	}
}
