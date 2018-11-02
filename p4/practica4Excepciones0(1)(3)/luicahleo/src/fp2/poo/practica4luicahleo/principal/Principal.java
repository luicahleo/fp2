/* Clase Principal.java*/

package fp2.poo.practica4luicahleo.principal;


import java.lang.*;
import fp2.poo.practica4luicahleo.interfaz.OperacionSumaInterfaz; 
import fp2.poo.practica4luicahleo.excepcion.ValorIncorrectoExcepcion;
import fp2.poo.practica4luicahleo.clase.OperacionSuma;

import java.lang.Exception;

public class Principal {

	public static void main(String args[]){

	System.out.println("Main................");


	
	try{
		OperacionSumaInterfaz ref00 = new OperacionSuma (4,100);
		System.out.println("Resultado: " + ref00.suma());
		OperacionSumaInterfaz ref01 = new OperacionSuma ();
		ref01.setValor1(100);
		ref01.setValor2(100);
		int resultado = ref01.suma();
		System.out.println("Resultado: " + resultado);
		OperacionSumaInterfaz ref03 = new OperacionSuma (4,101);
		System.out.println("Esta linea de codigo no se debe ejecutar.");
	}catch( ValorIncorrectoExcepcion e ) {
		System.out.println(e.toString());
	}


	}









}
