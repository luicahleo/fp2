/*
 *  Fichero: CuentaPrincipal.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.practica2luicahleo;


import java.lang.*;
import fp2.poo.utilidades.Cuenta;


public class CuentaPrincipal{
	public static void main(String args[ ]) {
		System.out.println("!!!!!!!!!!!!!!!!!SE EJECUTA MAIN PRINCIPAL!!!!!!!!!!!!!!");
  
//	creamos tabla para los 20 elementos

	Cuenta tabla[] = new Cuenta[20];
	System.out.println("!!!!!!!!!!!!!!!!Tabla creada!!!!!!!!!!!!!!");





	for(int i=0;i<tabla.length;i++){


		tabla[i] = new Cuenta("Usuario " + i, i+100);

		System.out.println(tabla[i].getNombre() + " " + tabla[i].getSaldo());

	}//end for




	}//end main
}//end public class
