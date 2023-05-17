package com.example.demo;

public class MatriculaCalculo {
	
	
	public void RealizarMatricula(String tipo) {
		if (tipo.equals("1")) {
			Materia mat=new Materia();
			mat.setNombre("P. Web");
			//insertar la base
			System.out.println("Se inserto Materia");
		}else {
			MateriaExtraordinaria matX=new MateriaExtraordinaria();
			matX.setNombre("P. Web");
			matX.setCantidadCreditos(10);
			//insertar la base 
			System.out.println("Se inserto Materia Extraordinaria");
		}
	}

}
